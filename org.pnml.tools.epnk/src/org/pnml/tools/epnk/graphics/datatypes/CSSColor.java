package org.pnml.tools.epnk.graphics.datatypes;

import java.awt.Color;
import javax.swing.text.html.StyleSheet;

import org.eclipse.swt.graphics.RGB;

// @generated NOT
public class CSSColor {
	
	private final RGB colour;
	
	private String value;
	
	public CSSColor(String value) throws IllegalFormatException  {
		this.value = value;

		Color colour = null;
		StyleSheet sheet = new StyleSheet();
		if (value.toLowerCase().equals("orange")) {
			// In addition to the 16 VGA color names, CSS 2.1 also supports
			// the colour orange by name; since this case is not covered by the
			// stringToColor method below, this is a special case.
			colour = sheet.stringToColor("#ffa500");
		} else {
			colour = sheet.stringToColor(value);
		}

		if (colour == null) {
			throw new IllegalFormatException("The color attribute is not in CSS2 format: " + value);
		} else {
			this.colour = new RGB(colour.getRed(), colour.getGreen(), colour.getBlue());
		}
	}
	
	public CSSColor(RGB colour) {
		if (colour != null) {
			this.colour = colour;
			this.value = "#"+intToHex(colour.red) + intToHex(colour.green) + intToHex(colour.blue);
		} else {
			throw new IllegalArgumentException("Color argument must not be null!");
		}
	}
	
	private static String intToHex(int i) {
		String result = Integer.toHexString(i);
		if (result.length() < 2) {
			result = "0"+result;
		}
		return result;
	}

	@Override
	public String toString() {
		return value;
	}
	
	public RGB getRGB() {
		return colour;
	}
	
	// TODO: Remove this main method, which was only used for experimenting how
	//       faithfully the StyleSheet method converts CSS2 colors.
	static public void main(String[] args) {

			String[] colorNames = { "RED", "black", "Black", "orange", "Orange", "bla",
					            "#000", "#0000Ff", "rgb( 50%, 50% ,0)", "rgb( 100%, 50% ,25%)",
					            "RGB( 100%, 50% ,25%)"};
			
			for (int i= 0; i < colorNames.length; i++) {
				try {
					System.out.println("\"" + colorNames[i] + "\": " + new CSSColor(colorNames[i]));
				} catch (IllegalFormatException e) {
					e.printStackTrace();
				}
			}
			
			/*
			Color[] colors = { Color.black, Color.CYAN, Color.RED, Color.orange, Color.white };
			
			for (int i= 0; i < colors.length; i++) {
				System.out.println("" + colors[i] + ": " + new CSSColor(colors[i]));
			}
			*/

	}
}
