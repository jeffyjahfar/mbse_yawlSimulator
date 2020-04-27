/**
 * 
 */
package mbse.project.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;

import mbse.project.YAWLnets.Place;
import mbse.project.YAWLnets.PlaceMarking;
import mbse.project.YAWLnets.PlaceTypes;


/**
 * @author jeffy s155191
 * @generated NOT
 *
 */
public class YAWLPlaces extends PlaceFigure {
	
	/**
	 * @param place
	 */
	public YAWLPlaces(Place place) {
		super(place);
		
	}
	
	@Override
	public void update() {
		this.repaint();
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		
		super.fillShape(graphics);
		// First, get the location and dimension of the place as a rectangle
		Rectangle rectangle = this.getClientArea();
		
		int m = 0;
		if (place instanceof Place) {
			m = getMarking((Place) place);
		}
		int cx = rectangle.x + rectangle.width/2;
		int cy = rectangle.y + rectangle.height/2;
				
		// eki: the token size and positions are tuned to the default size
		//      of places; they could be derived from the actual size of
		//      the place.
		if (m == 0) {
			Device device = null;
			Color rgb = new Color(device, 0, 153, 0);
			graphics.setBackgroundColor(rgb);
			int[] points = {cx+12,cy,cx,cy-6,cx,cy+6};
			graphics.fillPolygon(points);
		} else if (m == 1) {
			Device device = null;
			Color rgb = new Color(device, 255, 0, 0);
			graphics.setBackgroundColor(rgb);
			graphics.fillRectangle(cx-6, cy-6, 12, 12);
		} else {
			
		}
		
//		if(m==2){
//			graphics.drawString(""+count, cx-5, cy-7);
//		}
//		else if (count == 1) {
//			graphics.setBackgroundColor(getForegroundColor());
//			graphics.fillOval(cx-6, cy-6, 12, 12);
//		} else if (count == 2) {
//			graphics.setBackgroundColor(getForegroundColor());
//			graphics.fillOval(cx-11, cy-11, 12, 12);
//			graphics.fillOval(cx, cy, 12, 12);
//		} else if (count == 3) {
//			graphics.setBackgroundColor(getForegroundColor());
//			graphics.fillOval(cx-6, cy-13, 12, 12);
//			graphics.fillOval(cx-13, cy, 12, 12);
//			graphics.fillOval(cx+1, cy, 12, 12);
//		} else if (count == 4) {
//			graphics.setBackgroundColor(getForegroundColor());
//			graphics.fillOval(cx-13, cy-13, 12, 12);
//			graphics.fillOval(cx+1, cy-13, 12, 12);
//			graphics.fillOval(cx-13, cy+1, 12, 12);
//			graphics.fillOval(cx+1, cy+1, 12, 12);
//		} 
		
	}

	private int getMarking(Place place) {
		if (this.place instanceof Place) {
			PlaceMarking marking = place.getMarking();
			if (marking != null) {
				switch (marking.getText().getValue()) {
				case PlaceTypes.START_VALUE:
					return 0;
				case PlaceTypes.END_VALUE:
					return 1;
				
				}
			} 
		}
		return 3;
	}
	
//	private int getTokens(Place place){
//		if (this.place instanceof Place) {
//			EList<Token> token = place.getToken();
//			int count=0;
//			if(token != null){
//				count = token.size();
//			}
//			return count;
//		}
//		return 0;
//	}
}
