/**
 */
package mbse.project.YAWLnets;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place Marking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.project.YAWLnets.PlaceMarking#getText <em>Text</em>}</li>
 *   <li>{@link mbse.project.YAWLnets.PlaceMarking#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @see mbse.project.YAWLnets.YAWLnetsPackage#getPlaceMarking()
 * @model
 * @generated
 */
public interface PlaceMarking extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link mbse.project.YAWLnets.PlaceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see mbse.project.YAWLnets.PlaceTypes
	 * @see #setText(PlaceTypes)
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#getPlaceMarking_Text()
	 * @model
	 * @generated
	 */
	PlaceTypes getText();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.PlaceMarking#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see mbse.project.YAWLnets.PlaceTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(PlaceTypes value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mbse.project.YAWLnets.Place#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' container reference.
	 * @see #setPlace(Place)
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#getPlaceMarking_Place()
	 * @see mbse.project.YAWLnets.Place#getMarking
	 * @model opposite="marking" transient="false"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.PlaceMarking#getPlace <em>Place</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' container reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // PlaceMarking
