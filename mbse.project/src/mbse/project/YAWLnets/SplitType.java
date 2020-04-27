/**
 */
package mbse.project.YAWLnets;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.project.YAWLnets.SplitType#getText <em>Text</em>}</li>
 *   <li>{@link mbse.project.YAWLnets.SplitType#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see mbse.project.YAWLnets.YAWLnetsPackage#getSplitType()
 * @model
 * @generated
 */
public interface SplitType extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The literals are from the enumeration {@link mbse.project.YAWLnets.SplitTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see mbse.project.YAWLnets.SplitTypes
	 * @see #setText(SplitTypes)
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#getSplitType_Text()
	 * @model
	 * @generated
	 */
	SplitTypes getText();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.SplitType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see mbse.project.YAWLnets.SplitTypes
	 * @see #getText()
	 * @generated
	 */
	void setText(SplitTypes value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mbse.project.YAWLnets.Transition#getSplittype <em>Splittype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' container reference.
	 * @see #setTransition(Transition)
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#getSplitType_Transition()
	 * @see mbse.project.YAWLnets.Transition#getSplittype
	 * @model opposite="splittype" transient="false"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.SplitType#getTransition <em>Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' container reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // SplitType
