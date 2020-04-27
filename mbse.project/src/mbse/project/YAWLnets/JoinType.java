/**
 */
package mbse.project.YAWLnets;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.project.YAWLnets.JoinType#getText <em>Text</em>}</li>
 *   <li>{@link mbse.project.YAWLnets.JoinType#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see mbse.project.YAWLnets.YAWLnetsPackage#getJoinType()
 * @model
 * @generated
 */
public interface JoinType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link mbse.project.YAWLnets.JoinTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see mbse.project.YAWLnets.JoinTypes
	 * @see #setText(JoinTypes)
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#getJoinType_Text()
	 * @model
	 * @generated
	 */
	JoinTypes getText();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.JoinType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see mbse.project.YAWLnets.JoinTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(JoinTypes value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mbse.project.YAWLnets.Transition#getJointype <em>Jointype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' container reference.
	 * @see #setTransition(Transition)
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#getJoinType_Transition()
	 * @see mbse.project.YAWLnets.Transition#getJointype
	 * @model opposite="jointype" transient="false"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.JoinType#getTransition <em>Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' container reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // JoinType
