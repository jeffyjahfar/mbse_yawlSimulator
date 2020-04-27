/**
 */
package mbse.project.YAWLnets.impl;

import mbse.project.YAWLnets.JoinType;
import mbse.project.YAWLnets.SplitType;
import mbse.project.YAWLnets.Transition;
import mbse.project.YAWLnets.YAWLnetsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mbse.project.YAWLnets.impl.TransitionImpl#getSplittype <em>Splittype</em>}</li>
 *   <li>{@link mbse.project.YAWLnets.impl.TransitionImpl#getJointype <em>Jointype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl implements Transition {
	/**
	 * The cached value of the '{@link #getSplittype() <em>Splittype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplittype()
	 * @generated
	 * @ordered
	 */
	protected SplitType splittype;
	/**
	 * The cached value of the '{@link #getJointype() <em>Jointype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJointype()
	 * @generated
	 * @ordered
	 */
	protected JoinType jointype;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YAWLnetsPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitType getSplittype() {
		return splittype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSplittype(SplitType newSplittype, NotificationChain msgs) {
		SplitType oldSplittype = splittype;
		splittype = newSplittype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YAWLnetsPackage.TRANSITION__SPLITTYPE, oldSplittype, newSplittype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplittype(SplitType newSplittype) {
		if (newSplittype != splittype) {
			NotificationChain msgs = null;
			if (splittype != null)
				msgs = ((InternalEObject)splittype).eInverseRemove(this, YAWLnetsPackage.SPLIT_TYPE__TRANSITION, SplitType.class, msgs);
			if (newSplittype != null)
				msgs = ((InternalEObject)newSplittype).eInverseAdd(this, YAWLnetsPackage.SPLIT_TYPE__TRANSITION, SplitType.class, msgs);
			msgs = basicSetSplittype(newSplittype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YAWLnetsPackage.TRANSITION__SPLITTYPE, newSplittype, newSplittype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType getJointype() {
		return jointype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJointype(JoinType newJointype, NotificationChain msgs) {
		JoinType oldJointype = jointype;
		jointype = newJointype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YAWLnetsPackage.TRANSITION__JOINTYPE, oldJointype, newJointype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJointype(JoinType newJointype) {
		if (newJointype != jointype) {
			NotificationChain msgs = null;
			if (jointype != null)
				msgs = ((InternalEObject)jointype).eInverseRemove(this, YAWLnetsPackage.JOIN_TYPE__TRANSITION, JoinType.class, msgs);
			if (newJointype != null)
				msgs = ((InternalEObject)newJointype).eInverseAdd(this, YAWLnetsPackage.JOIN_TYPE__TRANSITION, JoinType.class, msgs);
			msgs = basicSetJointype(newJointype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YAWLnetsPackage.TRANSITION__JOINTYPE, newJointype, newJointype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YAWLnetsPackage.TRANSITION__SPLITTYPE:
				if (splittype != null)
					msgs = ((InternalEObject)splittype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YAWLnetsPackage.TRANSITION__SPLITTYPE, null, msgs);
				return basicSetSplittype((SplitType)otherEnd, msgs);
			case YAWLnetsPackage.TRANSITION__JOINTYPE:
				if (jointype != null)
					msgs = ((InternalEObject)jointype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YAWLnetsPackage.TRANSITION__JOINTYPE, null, msgs);
				return basicSetJointype((JoinType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YAWLnetsPackage.TRANSITION__SPLITTYPE:
				return basicSetSplittype(null, msgs);
			case YAWLnetsPackage.TRANSITION__JOINTYPE:
				return basicSetJointype(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YAWLnetsPackage.TRANSITION__SPLITTYPE:
				return getSplittype();
			case YAWLnetsPackage.TRANSITION__JOINTYPE:
				return getJointype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YAWLnetsPackage.TRANSITION__SPLITTYPE:
				setSplittype((SplitType)newValue);
				return;
			case YAWLnetsPackage.TRANSITION__JOINTYPE:
				setJointype((JoinType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case YAWLnetsPackage.TRANSITION__SPLITTYPE:
				setSplittype((SplitType)null);
				return;
			case YAWLnetsPackage.TRANSITION__JOINTYPE:
				setJointype((JoinType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case YAWLnetsPackage.TRANSITION__SPLITTYPE:
				return splittype != null;
			case YAWLnetsPackage.TRANSITION__JOINTYPE:
				return jointype != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
