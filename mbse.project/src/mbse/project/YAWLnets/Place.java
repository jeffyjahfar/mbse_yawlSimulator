/**
 */
package mbse.project.YAWLnets;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.project.YAWLnets.Place#getMarking <em>Marking</em>}</li>
 * </ul>
 *
 * @see mbse.project.YAWLnets.YAWLnetsPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Marking</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mbse.project.YAWLnets.PlaceMarking#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' containment reference.
	 * @see #setMarking(PlaceMarking)
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#getPlace_Marking()
	 * @see mbse.project.YAWLnets.PlaceMarking#getPlace
	 * @model opposite="place" containment="true"
	 * @generated
	 */
	PlaceMarking getMarking();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.Place#getMarking <em>Marking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' containment reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(PlaceMarking value);

} // Place
