/**
 * 
 */
package applications.YAWLNetSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;

import YAWLNetSimulator.EnabledTransition;
import YAWLNetSimulator.Marking;
import YAWLNetSimulator.YAWLNetSimulatorFactory;
import mbse.project.YAWLnets.Place;
import mbse.project.YAWLnets.Transition;

/**
 * @author jeffy s155191
 *
 */
public class EnabledTransitionsHandler implements IActionHandler {

	/**
	 * 
	 */
	
	private YAWLNetSimulatorApplication application;
	
	public EnabledTransitionsHandler(YAWLNetSimulatorApplication application) {
		super();
		this.application = application;	
	}

	/* (non-Javadoc)
	 * @see org.pnml.tools.epnk.applications.ui.IActionHandler#mouseDoubleClicked(org.eclipse.draw2d.MouseEvent, org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation)
	 */
	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		NetAnnotations netAnnotations = application.getNetAnnotations();
		NetAnnotation current = netAnnotations.getCurrent();
		
		FlatAccess flatNet = new FlatAccess(application.getPetrinet());
		
		if (current.getObjectAnnotations().contains(annotation)) {
			Object object = annotation.getObject();
			if (object instanceof Transition && annotation instanceof EnabledTransition) {
				Transition transition = (Transition) object;
				EnabledTransition transitionAnnotation = ((EnabledTransition) annotation);
				Map<Place,Integer> marking1 = application.computeMarking();
				if (application.enabled(flatNet, marking1, transition)) {
					Map<Place,Integer> marking2 = application.fireTransition(flatNet, marking1, transition, transitionAnnotation);
					NetAnnotation netAnnotation = application.computeAnnotation(flatNet, marking2);
					netAnnotation.setNet(application.getPetrinet());
					List<ObjectAnnotation> clearPlaceAnnotations = new ArrayList<ObjectAnnotation>();
					for (ObjectAnnotation objectAnnotation: current.getObjectAnnotations()) {
						if (objectAnnotation != transitionAnnotation && objectAnnotation instanceof EnabledTransition ) {
							application.update();
						} else if (objectAnnotation instanceof Marking) {
							clearPlaceAnnotations.add(objectAnnotation);
						}
					}
					current.getObjectAnnotations().removeAll(clearPlaceAnnotations);
					for (Arc arc: flatNet.getOut(transition)) {
						Object object2 = arc.getTarget();
						if (object2 instanceof PlaceNode) {
							PlaceNode target = flatNet.resolve((PlaceNode) object2);
							if (target != null) {
								Marking placeAnnotation = YAWLNetSimulatorFactory.eINSTANCE.createMarking();
								placeAnnotation.setObject(target);
								int value =0;
								if(marking2.containsKey(target)){
									value = marking2.get(target);
								}
								placeAnnotation.setValue(value);
								current.getObjectAnnotations().add(placeAnnotation);
							}
						}
					}
					application.deleteNetAnnotationAfterCurrent();
					application.addNetAnnotationAsCurrent(netAnnotation);
					return true;
				}
				
			}
		}
		
		return false;
	}

	/* (non-Javadoc)
	 * @see org.pnml.tools.epnk.applications.ui.IActionHandler#mousePressed(org.eclipse.draw2d.MouseEvent, org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation)
	 */
	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {		
		return false;
	}

	/* (non-Javadoc)
	 * @see org.pnml.tools.epnk.applications.ui.IActionHandler#mouseReleased(org.eclipse.draw2d.MouseEvent, org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation)
	 */
	@Override
	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		return false;
	}

}
