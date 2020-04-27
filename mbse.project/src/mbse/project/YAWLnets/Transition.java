/**
 */
package mbse.project.YAWLnets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.project.YAWLnets.Transition#getSplittype <em>Splittype</em>}</li>
 *   <li>{@link mbse.project.YAWLnets.Transition#getJointype <em>Jointype</em>}</li>
 * </ul>
 *
 * @see mbse.project.YAWLnets.YAWLnetsPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends org.pnml.tools.epnk.pnmlcoremodel.Transition {
	/**
	 * Returns the value of the '<em><b>Splittype</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mbse.project.YAWLnets.SplitType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Splittype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Splittype</em>' containment reference.
	 * @see #setSplittype(SplitType)
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#getTransition_Splittype()
	 * @see mbse.project.YAWLnets.SplitType#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	SplitType getSplittype();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.Transition#getSplittype <em>Splittype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Splittype</em>' containment reference.
	 * @see #getSplittype()
	 * @generated
	 */
	void setSplittype(SplitType value);

	/**
	 * Returns the value of the '<em><b>Jointype</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mbse.project.YAWLnets.JoinType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jointype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jointype</em>' containment reference.
	 * @see #setJointype(JoinType)
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#getTransition_Jointype()
	 * @see mbse.project.YAWLnets.JoinType#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	JoinType getJointype();

	/**
	 * Sets the value of the '{@link mbse.project.YAWLnets.Transition#getJointype <em>Jointype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jointype</em>' containment reference.
	 * @see #getJointype()
	 * @generated
	 */
	void setJointype(JoinType value);

} // Transition
