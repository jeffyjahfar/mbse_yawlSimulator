/**
 * 
 */
package mbse.project.yawlnets.graphics.figures;

import org.eclipse.swt.SWT;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;

import mbse.project.YAWLnets.Arc;
import mbse.project.YAWLnets.ArcType;
import mbse.project.YAWLnets.ArcTypes;



/**
 * @author s155191
 * @generated NOT
 */
public class YAWLArcs extends ArcFigure {

	
	
	private enum Type {
	    NORMAL, RESET
	}
	
	/**
	 * The current type of the arc.
	 */
	private Type type;
	/**
	 * @param arc
	 */
	public YAWLArcs(Arc arc) {
		super(arc);
		type = getType();
		setGraphics();
	}
	
	@Override
	public void update(){
		Type oldType = type;
		type = getType();
		if (oldType != type) {
			setGraphics();
		}
	}
	
	/**
	 * Computes the current type of the arc, which depends on the
	 * arc type attribute and on the way it is connected to nodes.
	 * 
	 * @return the current type of the arc
	 */
	private Type getType() {
		if (this.arc instanceof Arc) {
			ArcType arctype = ((Arc)arc).getType();
			if (arctype != null) {
				switch (arctype.getText().getValue()) {
				case ArcTypes.NORMAL_VALUE:
					return Type.NORMAL;
				case ArcTypes.RESET_VALUE:
					return Type.RESET;
				}
			} 
		}
		return Type.NORMAL;
	}
	
	private void setGraphics() {		
		if (type == Type.NORMAL) {
			this.setLineStyle(SWT.LINE_SOLID); 
		} else if (type == Type.RESET) {
			this.setLineStyle(SWT.LINE_DASH); 
		} 
	}

}
