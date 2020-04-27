package mbse.project.yawlnets.graphics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

import mbse.project.YAWLnets.YAWLnetsPackage;
import mbse.project.yawlnets.graphics.figures.YAWLArcs;

public class YAWLnetGraphics extends GraphicalExtension {

	/**
	 * Returns a singleton list with the YAWL net type.
	 * @generated NOT
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
}
