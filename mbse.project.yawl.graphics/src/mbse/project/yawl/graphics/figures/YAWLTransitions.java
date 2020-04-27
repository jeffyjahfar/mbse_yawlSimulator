/**
 * 
 */
package mbse.project.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.TransitionFigure;

import mbse.project.YAWLnets.JoinType;
import mbse.project.YAWLnets.JoinTypes;
import mbse.project.YAWLnets.SplitType;
import mbse.project.YAWLnets.SplitTypes;
import mbse.project.YAWLnets.Transition;

/**
 * @author jeffy s155191
 * @generated NOT
 */
public class YAWLTransitions extends TransitionFigure {
	
	private enum splittype{
		xor,or,and,single
	}
	
	private enum jointype{
		xor,or,and,single
	}
	
	private splittype oldsplittype;
	private jointype oldjointype;
	
	/**
	 * @param transition
	 */
	public YAWLTransitions(Transition transition) {
		super(transition);
		 oldsplittype = this.getSplitType();
		 oldjointype = this.getJoinType();
	}
	
	@Override
	public void update(){
		splittype newsplittype = this.getSplitType();
		jointype newjointype = this.getJoinType();
		if(newsplittype!= oldsplittype || newjointype!= oldjointype){
			this.repaint();
		}
		
	}
	
	@Override
	protected void fillShape(Graphics graphics){
		super.fillShape(graphics);
		splittype current_split = this.getSplitType();
		jointype current_join = this.getJoinType();
		
		Rectangle rectangle = this.getBounds();
		
		
		int cx = rectangle.x ;
		int cy = rectangle.y;
		int cw = rectangle.width;
		int ch = rectangle.height;
				
		if(current_join != null){
			if(current_join == jointype.and){
				graphics.setLineWidth(1);
				graphics.setForegroundColor(getForegroundColor());
				graphics.drawLine(cx+cw/3,cy,cx+cw/3,cy+ch);
				int[] points = {cx,cy,cx+cw/3,cy+ch/2,cx,cy+ch};
				graphics.drawPolygon(points);
			} else if(current_join == jointype.xor){
				graphics.setLineWidth(1);
				graphics.setForegroundColor(getForegroundColor());
				graphics.drawLine(cx+cw/3,cy,cx+cw/3,cy+ch);
				int[] points = {cx+cw/3,cy,cx+cw/3,cy+ch,cx,cy+ch/2};
				graphics.drawPolygon(points);
			}else if(current_join == jointype.or){
				graphics.setLineWidth(1);
				graphics.setForegroundColor(getForegroundColor());
				graphics.drawLine(cx+cw/3,cy,cx+cw/3,cy+ch);
				int[] points = {cx+cw/3,cy+ch/2,cx+cw/6,cy+ch,cx,cy+ch/2,cx+cw/6,cy};
				graphics.drawPolygon(points);
			}else if(current_join == jointype.single) {
	
			}
		}
		
		if(current_split != null){
			if(current_split == splittype.and){
				graphics.setLineWidth(1);
				graphics.setForegroundColor(getForegroundColor());
				graphics.drawLine(cx+2*cw/3,cy,cx+2*cw/3,cy+ch);
				int[] points = {cx+2*cw/3,cy+ch/2,cx+cw,cy+ch,cx+cw,cy};
				graphics.drawPolygon(points);
			} else if(current_split == splittype.xor){
				graphics.setLineWidth(1);
				graphics.setForegroundColor(getForegroundColor());
				graphics.drawLine(cx+2*cw/3,cy,cx+2*cw/3,cy+ch);
				int[] points = {cx+cw,cy+ch/2,cx+2*cw/3,cy+ch,cx+2*cw/3,cy};
				graphics.drawPolygon(points);
			}else if(current_split == splittype.or){
				graphics.setLineWidth(1);
				graphics.setForegroundColor(getForegroundColor());
				graphics.drawLine(cx+2*cw/3,cy,cx+2*cw/3,cy+ch);
				int[] points = {cx+cw,cy+ch/2,cx+5*cw/6,cy+ch,cx+2*cw/3,cy+ch/2,cx+5*cw/6,cy};
				graphics.drawPolygon(points);
			}else if(current_split == splittype.single) {
	
			}
		}
		
		
	}
	
	/**
	 * Computes the current type of the arc, which depends on the
	 * arc type attribute and on the way it is connected to nodes.
	 * 
	 * @return the current type of the transition
	 */
	private splittype getSplitType() {
		if (this.transition instanceof Transition) {
			SplitType type = ((Transition)transition).getSplittype();
			if (type != null) {
				switch (type.getText().getValue()) {
				case SplitTypes.AND_VALUE:
					return splittype.and;
				case SplitTypes.OR_VALUE:
					return splittype.or;
				case SplitTypes.XOR_VALUE:
					return splittype.xor;
				case SplitTypes.SINGLE_VALUE:
					return splittype.single;
				}
			} 
		}
		return splittype.single;
	}
	
	private jointype getJoinType() {
		if (this.transition instanceof Transition) {
			JoinType type = ((Transition)transition).getJointype();
			if (type != null) {
				switch (type.getText().getValue()) {
				case JoinTypes.AND_VALUE:
					return jointype.and;
				case JoinTypes.OR_VALUE:
					return jointype.or;
				case JoinTypes.XOR_VALUE:
					return jointype.xor;
				case JoinTypes.SINGLE_VALUE:
					return jointype.single;
				}
			} 
		}
		return jointype.single;
	}
	
	@Override
	protected void outlineShape(Graphics graphics) {
		
			super.outlineShape(graphics);
		
	}

}
