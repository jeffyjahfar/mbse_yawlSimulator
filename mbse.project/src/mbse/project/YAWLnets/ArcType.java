/**
 */
package mbse.project.YAWLnets;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.project.YAWLnets.ArcType#getText <em>Text</em>}</li>
 *   <li>{@link mbse.project.YAWLnets.ArcType#getArc <em>Arc</em>}</li>
 * </ul>
 *
 * @see mbse.project.YAWLnets.YAWLnetsPackage#getArcType()
 * @model
 * @generated
 */
public interface ArcType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Arc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mbse.project.YAWLnets.Arc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' container reference.
	 * @see #setArc(Arc)
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#getArcType_Arc()
	 * @see mbse.project.YAWLnets.Arc#getType
	 * @model opposite="type" transient="false"
	 * @generated
	 */
	Arc getArc();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.ArcType#getArc <em>Arc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc</em>' container reference.
	 * @see #getArc()
	 * @generated
	 */
	void setArc(Arc value);

	ArcTypes getText();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.ArcType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see mbse.project.YAWLnets.ArcTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(ArcTypes value);

} // ArcType
