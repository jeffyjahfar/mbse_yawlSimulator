/**
 * 
 */
package applications.YAWLNetSimulator;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;
import YAWLNetSimulator.EnabledTransition;
import YAWLNetSimulator.SelectArc;
import mbse.project.YAWLnets.Arc;
import mbse.project.YAWLnets.JoinTypes;
import mbse.project.YAWLnets.SplitTypes;
import mbse.project.YAWLnets.Transition;

/**
 * @author jeffy s155191
 *
 */
public class SelectArcsHandler implements IActionHandler {

	/**
	 * 
	 */
	private YAWLNetSimulatorApplication application;
	
	public SelectArcsHandler(YAWLNetSimulatorApplication application) {
		super();
		this.application = application;
	}

	/* (non-Javadoc)
	 * @see org.pnml.tools.epnk.applications.ui.IActionHandler#mouseDoubleClicked(org.eclipse.draw2d.MouseEvent, org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation)
	 */
	//Pressing mouse button unselects the arc
	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		NetAnnotations netAnnotations = application.getNetAnnotations();
		NetAnnotation current = netAnnotations.getCurrent();
		
		if(current.getObjectAnnotations().contains(annotation)){
			Object object = annotation.getObject();
			if(object instanceof Arc && annotation instanceof SelectArc){
				SelectArc selectarcAnnotation = (SelectArc) annotation;				
				if(selectarcAnnotation.isSelected()){
					if(selectarcAnnotation.getSourceTransition() != null){
						EnabledTransition currentTransitionAnnotation = selectarcAnnotation.getSourceTransition();
						Object transitionObject = currentTransitionAnnotation.getObject();
						if(transitionObject instanceof Transition){
							Transition transition = (Transition)transitionObject;
							if(transition.getSplittype().getText() == SplitTypes.OR){
								int countoutArcs = 0;
								for(SelectArc outgoingarc: currentTransitionAnnotation.getOutArcs()){
									if(outgoingarc != selectarcAnnotation && outgoingarc.isSelected()){
										countoutArcs++;
									}
								}
								if(countoutArcs>=1){
									selectarcAnnotation.setSelected(false);
									application.update();
								}
							}
						}
						
					}
				}else{
					if(selectarcAnnotation.getSourceTransition() != null){
						EnabledTransition currentTransitionAnnotation = selectarcAnnotation.getSourceTransition();
						Object transitionObject = currentTransitionAnnotation.getObject();
						if(transitionObject instanceof Transition){
							Transition transition = (Transition)transitionObject;
							if(transition.getSplittype().getText() == SplitTypes.OR){
								selectarcAnnotation.setSelected(true);
								application.update();								
							}else if(transition.getSplittype().getText() == SplitTypes.XOR){
								for(SelectArc outgoingarc: currentTransitionAnnotation.getOutArcs()){
									if(outgoingarc == selectarcAnnotation){
										outgoingarc.setSelected(true);
									}else{
										outgoingarc.setSelected(false);
									}
								}
								application.update();
							}
						}
					}else if(selectarcAnnotation.getTargetTransition() != null){
						EnabledTransition currentTransitionAnnotation = selectarcAnnotation.getTargetTransition();
						Object transitionObject = currentTransitionAnnotation.getObject();
						if(transitionObject instanceof Transition){
							Transition transition = (Transition)transitionObject;
							if(transition.getJointype().getText() == JoinTypes.XOR){
								for(SelectArc incomingArc: currentTransitionAnnotation.getInArcs()){
									if(incomingArc != selectarcAnnotation && incomingArc.isSelected()){
										incomingArc.setSelected(false);
									}else{
										incomingArc.setSelected(true);
									}
								}
								application.update();
							}
						}
					}
				}
				application.deleteNetAnnotationAfterCurrent();
				application.addNetAnnotationAsCurrent(current);
				return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.pnml.tools.epnk.applications.ui.IActionHandler#mousePressed(org.eclipse.draw2d.MouseEvent, org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation)
	 */
	
	// Double click button selects the arc
	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
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
