/**
 * 
 */
package applications.YAWLNetSimulator;

import java.util.HashMap;
import java.util.Map;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Object;


import YAWLNetSimulator.EnabledTransition;
import YAWLNetSimulator.Marking;
import YAWLNetSimulator.SelectArc;
import YAWLNetSimulator.Warning;
import YAWLNetSimulator.YAWLNetSimulatorFactory;
import mbse.project.YAWLnets.Arc;
import mbse.project.YAWLnets.ArcType;
import mbse.project.YAWLnets.ArcTypes;
import mbse.project.YAWLnets.JoinTypes;
import mbse.project.YAWLnets.Place;
import mbse.project.YAWLnets.PlaceMarking;
import mbse.project.YAWLnets.PlaceTypes;
import mbse.project.YAWLnets.SplitTypes;
import mbse.project.YAWLnets.Transition;


/**
 * @author jeffy s155191
 *
 */
public class YAWLNetSimulatorApplication extends ApplicationWithUIManager {

	/**
	 * @param petrinet
	 */
	public YAWLNetSimulatorApplication(PetriNet petrinet) {
		super(petrinet);
		getNetAnnotations().setName("YAWL Simulator");
		ApplicationUIManager manager = this.getPresentationManager();
		manager.addPresentationHandler(new YAWLNetPresentationHandler());
		manager.addActionHandler(new SelectArcsHandler(this));
		manager.addActionHandler(new EnabledTransitionsHandler(this));		
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
			if (annotation instanceof Marking) {
				Marking markingAnnotation = (Marking) annotation;
				Object object = markingAnnotation.getObject();
				if (object instanceof Place) {
					Place ptPlace = (Place) object;
					if(markingAnnotation.getValue()>0){
						marking.put(ptPlace, markingAnnotation.getValue());
					}
					
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
				}else{
					marking.put(ptPlace,0);
				} 
					
				}
			}
		
		return marking;
	}
	
	//compute annotation function
	NetAnnotation computeAnnotation(FlatAccess flatNet, Map<Place, Integer> marking) {
		NetAnnotation annotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();
		for (Place place: marking.keySet()) {
			int value = marking.get(place);
			
//			if (value > 0) {
				Marking markingAnnotation = YAWLNetSimulatorFactory.eINSTANCE.createMarking();
				
					markingAnnotation.setObject(place);
					markingAnnotation.setValue(value);
					annotation.getObjectAnnotations().add(markingAnnotation);
				
				
				// also annotate reference places with the current marking of the place
				for (PlaceNode ref: flatNet.getRefPlaces(place)) {
					Marking markingAnnotationRef = YAWLNetSimulatorFactory.eINSTANCE.createMarking();
					markingAnnotationRef.setValue(value);
					markingAnnotationRef.setObject(ref);
					annotation.getObjectAnnotations().add(markingAnnotationRef);	
				}
//			}
		}
		
		for (Node transition: flatNet.getTransitions()) {
			if (transition instanceof Transition) {
				EnabledTransition transitionAnnotation =
						YAWLNetSimulatorFactory.eINSTANCE.createEnabledTransition();
				if (enabled(flatNet, marking, (Transition) transition)) {			
					transitionAnnotation.setObject(transition);
					annotation.getObjectAnnotations().add(transitionAnnotation);
				
				if(((Transition)transition).getJointype() != null){
					if(((Transition)transition).getJointype().getText() == JoinTypes.XOR){
						int arcCount =0;
						for( Object incomingarc: flatNet.getIn(transition) ){
							SelectArc selectarcAnnotation = YAWLNetSimulatorFactory.eINSTANCE.createSelectArc();
							if(arcCount ==0){
								selectarcAnnotation.setSelected(true);
							}
							selectarcAnnotation.setTargetTransition(transitionAnnotation);
							selectarcAnnotation.setObject(incomingarc);
							annotation.getObjectAnnotations().add(selectarcAnnotation);
							
						}
					}else if(((Transition)transition).getJointype().getText() == JoinTypes.OR){
						int arcCount =0;
						for( Object incomingarc: flatNet.getIn(transition) ){
							Warning warningAnnotation = YAWLNetSimulatorFactory.eINSTANCE.createWarning();
							
//							selectarcAnnotation.setTargetTransition(transitionAnnotation);
//							selectarcAnnotation.setObject(incomingarc);
//							annotation.getObjectAnnotations().add(selectarcAnnotation);
							
						}
					}
					
				}
				if(((Transition)transition).getSplittype() != null){
				if(((Transition)transition).getSplittype().getText() == SplitTypes.OR){
					for( Object outgoingarc: flatNet.getOut(transition) ){
						SelectArc selectarcAnnotation = YAWLNetSimulatorFactory.eINSTANCE.createSelectArc();
						selectarcAnnotation.setSelected(true);
						selectarcAnnotation.setSourceTransition(transitionAnnotation);
						selectarcAnnotation.setObject(outgoingarc);
						annotation.getObjectAnnotations().add(selectarcAnnotation);
					}
				} else if(((Transition)transition).getSplittype().getText() == SplitTypes.XOR){
					int count =0;
					for( Object outgoingarc: flatNet.getOut(transition) ){
						SelectArc selectarcAnnotation = YAWLNetSimulatorFactory.eINSTANCE.createSelectArc();
						if(count==0){
							selectarcAnnotation.setSelected(true);
						}
						selectarcAnnotation.setSourceTransition(transitionAnnotation);
						selectarcAnnotation.setObject(outgoingarc);
						annotation.getObjectAnnotations().add(selectarcAnnotation);
						count = count+1;
					}
				}
				}
				}
			}
		}
		return annotation;
	}
	
	boolean enabled(FlatAccess flatNet, Map<Place, Integer> marking, Transition transition) {
		// TODO this does not work yet if there is more than one arc between the same
		//      place and the same transition!
		boolean check = true;
		if(transition.getJointype() != null){
			if(transition.getJointype().getText() == JoinTypes.AND){
				check = true;
				for(Object arc:flatNet.getIn(transition)){
					if(arc instanceof Arc){
						Arc yawlArc = (Arc)arc;
						Object source = yawlArc.getSource();
						if(source instanceof Place){
							if(marking.get(source) == null || marking.get(source) < 1){
								check = false;
							}
							
						}
					}
					
				}
				return check;
			} else{
				check = false;
				for(Object arc:flatNet.getIn(transition)){
					if(arc instanceof Arc){
						Arc yawlArc = (Arc)arc;
						Object source = yawlArc.getSource();
						if(source instanceof Place){
							if(marking.get(source) != null && marking.get(source) >0){
								check = true;
							}
							
						}
					}
					
				}
				return check;
			}
		} else if(transition.getSplittype() != null){
			check = false;
			for(Object arc:flatNet.getIn(transition)){
				if(arc instanceof Arc){
					Arc yawlArc = (Arc)arc;
					Object source = yawlArc.getSource();
					if(source instanceof Place){
						if(marking.get(source) != null && marking.get(source) >0){
							check = true;
						}
						
					}
				}
				
			}
			return check;
			
		}
		
		return false;
	}
	
	Map<Place, Integer> fireTransition(FlatAccess flatNet, Map<Place, Integer> marking1, Transition transition, EnabledTransition transitionAnnotation) {
		Map<Place,Integer> marking2 = new HashMap<Place, Integer>();
		for (Place place: marking1.keySet()) {
			marking2.put(place, marking1.put(place, marking1.get(place)));
		}
		
		if(transition.getSplittype() != null){
			if(transition.getSplittype().getText() == SplitTypes.AND){							
				//take one token each from each incoming arc's source place
				for(org.pnml.tools.epnk.pnmlcoremodel.Arc incomingarc: transition.getIn()){
					Place source = (Place) incomingarc.getSource();														
					Arc checkArc = (Arc) incomingarc;
					int tokens =0;
					if(checkArc.getType() != null && checkArc.getType().getText() == ArcTypes.NORMAL){
						if(marking1.get(source) != null && marking1.get(source)>0 ){
							tokens = marking1.get(source);
							tokens = tokens-1;
						}
					}else if(checkArc.getType() != null && checkArc.getType().getText() == ArcTypes.RESET){
						tokens=0;
					}
					marking2.put(source, tokens);
				}
				
				//put one token each in outgoing arc's target place
				for(org.pnml.tools.epnk.pnmlcoremodel.Arc outgoingarc: transition.getOut()){
					Place target = (Place) outgoingarc.getTarget();
					int tokens = 0;
					if(marking1.containsKey(target)){
						tokens= marking1.get(target);
					}
					tokens = tokens+1;
					marking2.put(target, tokens);									
				}
			} else if(transition.getSplittype().getText() == SplitTypes.XOR || transition.getSplittype().getText() == SplitTypes.OR ){
				
				//take one token each from each incoming arc's source place
				for(org.pnml.tools.epnk.pnmlcoremodel.Arc incomingarc: transition.getIn()){
					Place source = (Place) incomingarc.getSource();														

					Arc checkArc = (Arc) incomingarc;
					int tokens =0;
					if(checkArc.getType() != null && checkArc.getType().getText() == ArcTypes.NORMAL){
						if(marking1.get(source) != null && marking1.get(source)>0 ){
							tokens = marking1.get(source);
							tokens = tokens-1;
						}
					}else if(checkArc.getType() != null && checkArc.getType().getText() == ArcTypes.RESET){
						tokens=0;
					}
					marking2.put(source, tokens);
				}
				
				//put one token each in outgoing arc's target place that is selected
				for(SelectArc arcAnnotation : transitionAnnotation.getOutArcs()){
					if(arcAnnotation.isSelected()){
						Arc outgoingarc = (Arc) arcAnnotation.getObject();
						Place target = (Place) outgoingarc.getTarget();
						int tokens = 0;
						if(marking1.get(target) != null){
							tokens = marking1.get(target);
						}
						tokens = tokens+1;					
						marking2.put(target, tokens);									
					}										
				}
			}
		} else if(transition.getJointype() != null){
			if(transition.getJointype().getText() == JoinTypes.AND){
				//take one token each from each incoming arc's source place
				for(org.pnml.tools.epnk.pnmlcoremodel.Arc incomingarc: transition.getIn()){
					Place source = (Place) incomingarc.getSource();														

					Arc checkArc = (Arc) incomingarc;
					int tokens =0;
					if(checkArc.getType() != null && checkArc.getType().getText() == ArcTypes.NORMAL){
						if(marking1.get(source) != null && marking1.get(source)>0 ){
							tokens = marking1.get(source);
							tokens = tokens-1;
						}
					}else if(checkArc.getType() != null && checkArc.getType().getText() == ArcTypes.RESET){
						tokens=0;
					}
					marking2.put(source, tokens);					
				}
				
				//put one token each in outgoing arc's target place
				for(org.pnml.tools.epnk.pnmlcoremodel.Arc outgoingarc: transition.getOut()){
					Place target = (Place) outgoingarc.getTarget();
					int tokens = 0;
					if(marking1.containsKey(target)){
						tokens= marking1.get(target);
					}
					tokens = tokens+1;					
					marking2.put(target, tokens);									
				}
			} else if(transition.getJointype().getText() == JoinTypes.XOR){
				
				for(SelectArc arcAnnotation : transitionAnnotation.getInArcs()){
					if(arcAnnotation.isSelected()){
						Arc incomingarc = (Arc) arcAnnotation.getObject();
						Place source = (Place) incomingarc.getSource();	
						Arc checkArc = (Arc) incomingarc;
						int tokens =0;
						if(checkArc.getType() != null && checkArc.getType().getText() == ArcTypes.NORMAL){
							if(marking1.get(source) != null && marking1.get(source)>0 ){
								tokens = marking1.get(source);
								tokens = tokens-1;
							}
						}else if(checkArc.getType() != null && checkArc.getType().getText() == ArcTypes.RESET){
							tokens=0;
						}
						marking2.put(source, tokens);
					}										
				}
				
				
				//put one token each in outgoing arc's target place
				for(org.pnml.tools.epnk.pnmlcoremodel.Arc outgoingarc: transition.getOut()){
					Place target = (Place) outgoingarc.getTarget();
					int tokens = 0;
					if(marking1.containsKey(target)){
						tokens= marking1.get(target);
					}		
					tokens = tokens+1;					
					marking2.put(target, tokens);									
				}
			} else if(transition.getJointype().getText() == JoinTypes.OR){
				for(org.pnml.tools.epnk.pnmlcoremodel.Arc incomingarc: transition.getIn()){
					Place source = (Place) incomingarc.getSource();														
					Arc checkArc = (Arc) incomingarc;
					int tokens =0;
					if(checkArc.getType() != null && checkArc.getType().getText() == ArcTypes.NORMAL){
						if(marking1.get(source) != null && marking1.get(source)>0 ){
							tokens = marking1.get(source);
							tokens = tokens-1;
						}
					}else if(checkArc.getType() != null && checkArc.getType().getText() == ArcTypes.RESET){
						tokens=0;
					}
					marking2.put(source, tokens);					
				}
				
				
				//put one token each in outgoing arc's target place
				for(org.pnml.tools.epnk.pnmlcoremodel.Arc outgoingarc: transition.getOut()){
					Place target = (Place) outgoingarc.getTarget();
					int tokens = 0;
					if(marking1.containsKey(target)){
						tokens= marking1.get(target);
					}		
					tokens = tokens+1;					
					marking2.put(target, tokens);									
				}
			
			}
		}

		return marking2;
	}
}
