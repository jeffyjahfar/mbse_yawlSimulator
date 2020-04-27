package org.pnml.tools.epnk.graphics.datatypes;

/**
 * A data type representing a URI. Actually the syntax of the URI is
 * not checked at all.
 * 
 * @author eki
 *
 */
// @generated NOT
public class URI {
	
	private String value;
	
	public URI(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

}
