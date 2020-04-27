/**
 * 
 */
package mbse.project.yawl.graphics.figures;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import mbse.project.YAWLnets.YAWLnetsPackage;

/**
 * @author jeffy s155191
 * @generated NOT
 */
public class YAWLGraphics extends GraphicalExtension {

	/**
	 * Returns a singleton list with the YAWL net type.
	 
	 */
	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(YAWLnetsPackage.eINSTANCE.getYAWLnet());
		return list;
	}

	/**
	 * Returns a list referring to the EClass Arc and the EClass Place 
	 * of the YAWL net type .
	 */
	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		if (netType.equals(YAWLnetsPackage.eINSTANCE.getYAWLnet())) {
			list.add(YAWLnetsPackage.eINSTANCE.getArc());
			list.add(YAWLnetsPackage.eINSTANCE.getPlace());
			list.add(YAWLnetsPackage.eINSTANCE.getTransition());
		}
		return list;
	}

	/**
	 * Returns the specific figure for arcs of the YAWL net type.
	 * 
	 */
	@Override
	public ArcFigure createArcFigure(Arc arc) {
		if (arc instanceof mbse.project.YAWLnets.Arc) {
			return new YAWLArcs((mbse.project.YAWLnets.Arc) arc);
		}
		return null;
	}
	
	/**
	 * Returns the specific figure for places of the YAWLnet type.
	 */
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		if (place instanceof mbse.project.YAWLnets.Place ) {
			return new YAWLPlaces((mbse.project.YAWLnets.Place) place);
		}
		return null;
	}
	
	/**
	 * Returns the specific figure for transitions of the YAWLnet type.
	 */
	@Override
	public IUpdateableFigure createTransitionFigure(Transition transition) {
		if (transition instanceof mbse.project.YAWLnets.Transition ) {
			return new YAWLTransitions((mbse.project.YAWLnets.Transition) transition);
		}
		return null;
	}

}
