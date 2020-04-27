/**
 * 
 */
package applications.YAWLNetSimulator;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IPresentationHandler;
import org.pnml.tools.epnk.applications.ui.figures.EllipseOverlay;
import org.pnml.tools.epnk.applications.ui.figures.PolylineOverlay;
import org.pnml.tools.epnk.applications.ui.figures.RectangleOverlay;


import YAWLNetSimulator.EnabledTransition;
import YAWLNetSimulator.SelectArc;
import YAWLNetSimulator.Warning;
import mbse.project.YAWLnets.Arc;
import mbse.project.YAWLnets.Place;
import mbse.project.YAWLnets.Transition;

/**
 * @author jeffy s155191
 *
 */
public class YAWLNetPresentationHandler implements IPresentationHandler {

	/* (non-Javadoc)
	 * @see org.pnml.tools.epnk.applications.ui.IPresentationHandler#handle(org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation, org.eclipse.gef.editparts.AbstractGraphicalEditPart)
	 */
	@Override
	public IFigure handle(ObjectAnnotation annotation, AbstractGraphicalEditPart graphicalEditPart) {
		if(annotation instanceof EnabledTransition){
			if(graphicalEditPart instanceof GraphicalEditPart){
				java.lang.Object modelObject = ((GraphicalEditPart) graphicalEditPart).resolveSemanticElement();
				if (modelObject instanceof Transition) {
					RectangleOverlay overlay = new RectangleOverlay(graphicalEditPart);
					overlay.setForegroundColor(ColorConstants.blue);
					overlay.setBackgroundColor(ColorConstants.blue);					
					return overlay;
				}
			}
		}else if(annotation instanceof SelectArc){
			SelectArc selectarcAnnotation = (SelectArc) annotation;
			if(graphicalEditPart instanceof ConnectionNodeEditPart){
				Arc currentArc = (Arc) selectarcAnnotation.getObject();
				if(currentArc instanceof Arc){
					PolylineOverlay overlay = new PolylineOverlay((ConnectionNodeEditPart) graphicalEditPart);
					if(selectarcAnnotation.isSelected()){
						overlay.setForegroundColor(ColorConstants.green);
					} else{
						overlay.setForegroundColor(ColorConstants.gray);
					}
					
					return overlay;
				}
			}			
		}else if(annotation instanceof Warning){
			Warning warningAnnotation = (Warning) annotation;
			if(graphicalEditPart instanceof ConnectionNodeEditPart){
				Arc currentArc = (Arc) warningAnnotation.getObject();
				if(currentArc instanceof Arc){
					PolylineOverlay overlay = new PolylineOverlay((ConnectionNodeEditPart) graphicalEditPart);
					
						overlay.setForegroundColor(ColorConstants.red);
										
					return overlay;
				}
			}
			if(graphicalEditPart instanceof GraphicalEditPart){
				java.lang.Object modelObject = ((GraphicalEditPart) graphicalEditPart).resolveSemanticElement();
				if (modelObject instanceof Transition) {
					RectangleOverlay overlay = new RectangleOverlay(graphicalEditPart);
					overlay.setForegroundColor(ColorConstants.red);
					overlay.setBackgroundColor(ColorConstants.red);					
					return overlay;
				}
			}
			if(graphicalEditPart instanceof GraphicalEditPart){
				java.lang.Object modelObject = ((GraphicalEditPart) graphicalEditPart).resolveSemanticElement();
				if (modelObject instanceof Place) {
//					RectangleOverlay overlay = new RectangleOverlay(graphicalEditPart);
					EllipseOverlay overlay = new EllipseOverlay(graphicalEditPart);
					overlay.setForegroundColor(ColorConstants.red);
					overlay.setBackgroundColor(ColorConstants.red);					
					return overlay;
				}
			}
		}				
		return null;
	}

}
