package org.pnml.tools.epnk.tutorial.application.ptnetsimulator;

import java.util.HashMap;
import java.util.Map;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import mbse.project.YAWLnets.Arc;
import mbse.project.YAWLnets.Place;
import mbse.project.YAWLnets.PlaceMarking;
import mbse.project.YAWLnets.PlaceTypes;
import ptnetsimulator.Mode;
import ptnetsimulator.PlaceMarkingAnnotation;
import ptnetsimulator.PtnetsimulatorFactory;
import ptnetsimulator.TransitionActivationAnnotation;

public class PTNetSimulatorApplication extends ApplicationWithUIManager {

	public PTNetSimulatorApplication(PetriNet petrinet) {
		super(petrinet);
		getNetAnnotations().setName("P/T-net simulator");
		ApplicationUIManager manager = this.getPresentationManager();
		manager.addActionHandler(new FireTransitionHandler(this));
		manager.addActionHandler(new SelectPlaceHandler(this));
		manager.addPresentationHandler(new PTSimulationPresentationHandler());
	}

	@Override
	protected void initializeContents() {
		FlatAccess flatNet = new FlatAccess(this.getPetrinet());
		Map<Place,Integer> initialMarking = computeInitialMarking(flatNet);
		NetAnnotation initialAnnotation = computeAnnotation(flatNet, initialMarking);
		initialAnnotation.setNet(this.getPetrinet());
		
		this.getNetAnnotations().getNetAnnotations().add(initialAnnotation);
		this.getNetAnnotations().setCurrent(initialAnnotation);
	}

	Map<Place, Integer> computeMarking() {
		Map<Place,Integer> marking = new HashMap<Place,Integer>();
		for (ObjectAnnotation annotation: this.getNetAnnotations().getCurrent().getObjectAnnotations()) {
			if (annotation instanceof PlaceMarkingAnnotation) {
				PlaceMarkingAnnotation markingAnnotation = (PlaceMarkingAnnotation) annotation;
				Object object = markingAnnotation.getObject();
				if (object instanceof Place && markingAnnotation.getText() > 0) {
					Place ptPlace = (Place) object;
					marking.put(ptPlace, markingAnnotation.getText());
				}
			}
		}
		return marking;
	}

	Map<Place, Integer> computeInitialMarking(FlatAccess flatNet) {
		Map<Place,Integer> marking = new HashMap<Place,Integer>();
		for (org.pnml.tools.epnk.pnmlcoremodel.Place place: flatNet.getPlaces()) {
			if (place instanceof Place) {
				Place ptPlace = (Place) place;
				// FIXed: make sure to create a token if and only if the place is a YAWL start place
				PlaceMarking ptMarking = ptPlace.getMarking();
				if (ptMarking != null && ptMarking.getText() != null && ptMarking.getText() == PlaceTypes.START) {
					marking.put(ptPlace,ptMarking.getText().getValue());
				} 
			}
		}
		return marking;
	}
	
	Map<Place, Integer> fireTransition(FlatAccess flatNet, Map<Place, Integer> marking1, Transition transition) {
		Map<Place,Integer> marking2 = new HashMap<Place, Integer>();
		for (Place place: marking1.keySet()) {
			marking2.put(place, marking1.put(place, marking1.get(place)));
		}
		
		for (Object arc: flatNet.getIn(transition)) {
			if (arc instanceof Arc) {
				Arc ptArc = (Arc) arc;
				// FIXed: you need to delete the stuff concerning PTArcInscriptions since
				//        YAWL nets do not have them (every arc needs exactly one token)
//				PTArcAnnotation ptArcAnnotation = ptArc.getInscription();
				Object source  = ptArc.getSource();
				if (source instanceof PlaceNode) {
					source = flatNet.resolve((PlaceNode) source);
					if (source instanceof Place) {
						Place place = (Place) source;
						int available = 0;
						if (marking1.containsKey(place)) {
							available = marking1.get(place);
						}
						int needed = 1;
						// FIXEd: can be deleted since needed should be 1 for all arcs
//						if (ptArcAnnotation != null) {
//							needed = ptArcAnnotation.getText().getValue();
//						}
						marking2.put(place, available-needed);
					}
				}
			}
		}
		
		for (Object arc: flatNet.getOut(transition)) {
			if (arc instanceof Arc) {
				Arc ptArc = (Arc) arc;
//				PTArcAnnotation ptArcAnnotation = ptArc.getInscription();
				Object target  = ptArc.getTarget();
				if (target instanceof PlaceNode) {
					target = flatNet.resolve((PlaceNode) target);
					if (target instanceof Place) {
						Place place = (Place) target;
						int available = 0;
						if (marking1.containsKey(place)) {
							available = marking1.get(place);
						}
						int provided = 1; 
						//        every arc provides one token
//						if (ptArcAnnotation != null) {
//							provided = ptArcAnnotation.getText().getValue();
//						}
						marking2.put(place, available+provided);
					}
				}
			}
		}

		return marking2;
	}

	
	boolean enabled(FlatAccess flatNet, Map<Place, Integer> marking, Transition transition) {
		// TODO this does not work yet if there is more than one arc between the same
		//      place and the same transition!
		for (Object arc: flatNet.getIn(transition)) {
			if (arc instanceof Arc) {
				Arc ptArc = (Arc) arc;
				//        YAWL nets do not have them (every arc needs exactly one token)
//				PTArcAnnotation ptArcAnnotation = ptArc.getInscription();
				int available = 0;
				Object source = ptArc.getSource();
				if (source instanceof PlaceNode) {
					source = flatNet.resolve((PlaceNode) source);
					if (source instanceof Place) {
						if (marking.containsKey(source)) {
							available = marking.get(source);
						}
						int needed = 1; 
//						if (ptArcAnnotation != null) {
//							needed = ptArcAnnotation.getText().getValue();
//						}
						if (available < needed) {
							return false;
						}
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	NetAnnotation computeAnnotation(FlatAccess flatNet, Map<Place, Integer> marking) {
		NetAnnotation annotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();
		for (Place place: marking.keySet()) {
			int value = marking.get(place);
			if (value > 0) {
				PlaceMarkingAnnotation markingAnnotation = PtnetsimulatorFactory.eINSTANCE.createPlaceMarkingAnnotation();
				markingAnnotation.setText(value);
				markingAnnotation.setObject(place);
				annotation.getObjectAnnotations().add(markingAnnotation);
				// also annotate reference places with the current marking of the place
				for (PlaceNode ref: flatNet.getRefPlaces(place)) {
					PlaceMarkingAnnotation markingAnnotationRef = PtnetsimulatorFactory.eINSTANCE.createPlaceMarkingAnnotation();
					markingAnnotationRef.setText(value);
					markingAnnotationRef.setObject(ref);
					annotation.getObjectAnnotations().add(markingAnnotationRef);	
				}
			}
		}
		
		for (Node transition: flatNet.getTransitions()) {
			if (transition instanceof Transition) {
				if (enabled(flatNet, marking, (Transition) transition)) {
					TransitionActivationAnnotation transitionAnnotation =
							PtnetsimulatorFactory.eINSTANCE.createTransitionActivationAnnotation();
					transitionAnnotation.setObject(transition);
					transitionAnnotation.setMode(Mode.ENABLED);
					annotation.getObjectAnnotations().add(transitionAnnotation);
				}
			}
		}
		return annotation;
	}
}
