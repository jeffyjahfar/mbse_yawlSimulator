/**
 */
package mbse.project.YAWLnets.impl;

import mbse.project.YAWLnets.Place;
import mbse.project.YAWLnets.PlaceMarking;
import mbse.project.YAWLnets.PlaceTypes;
import mbse.project.YAWLnets.YAWLnetsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.pnml.tools.epnk.pnmlcoremodel.impl.AttributeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place Marking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mbse.project.YAWLnets.impl.PlaceMarkingImpl#getText <em>Text</em>}</li>
 *   <li>{@link mbse.project.YAWLnets.impl.PlaceMarkingImpl#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceMarkingImpl extends AttributeImpl implements PlaceMarking {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final PlaceTypes TEXT_EDEFAULT = PlaceTypes.START;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected PlaceTypes text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceMarkingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YAWLnetsPackage.Literals.PLACE_MARKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceTypes getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(PlaceTypes newText) {
		PlaceTypes oldText = text;
		text = newText == null ? TEXT_EDEFAULT : newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YAWLnetsPackage.PLACE_MARKING__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getPlace() {
		if (eContainerFeatureID() != YAWLnetsPackage.PLACE_MARKING__PLACE) return null;
		return (Place)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlace(Place newPlace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPlace, YAWLnetsPackage.PLACE_MARKING__PLACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Place newPlace) {
		if (newPlace != eInternalContainer() || (eContainerFeatureID() != YAWLnetsPackage.PLACE_MARKING__PLACE && newPlace != null)) {
			if (EcoreUtil.isAncestor(this, newPlace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPlace != null)
				msgs = ((InternalEObject)newPlace).eInverseAdd(this, YAWLnetsPackage.PLACE__MARKING, Place.class, msgs);
			msgs = basicSetPlace(newPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YAWLnetsPackage.PLACE_MARKING__PLACE, newPlace, newPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YAWLnetsPackage.PLACE_MARKING__PLACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPlace((Place)otherEnd, msgs);
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
			case YAWLnetsPackage.PLACE_MARKING__PLACE:
				return basicSetPlace(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case YAWLnetsPackage.PLACE_MARKING__PLACE:
				return eInternalContainer().eInverseRemove(this, YAWLnetsPackage.PLACE__MARKING, Place.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YAWLnetsPackage.PLACE_MARKING__TEXT:
				return getText();
			case YAWLnetsPackage.PLACE_MARKING__PLACE:
				return getPlace();
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
			case YAWLnetsPackage.PLACE_MARKING__TEXT:
				setText((PlaceTypes)newValue);
				return;
			case YAWLnetsPackage.PLACE_MARKING__PLACE:
				setPlace((Place)newValue);
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
			case YAWLnetsPackage.PLACE_MARKING__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case YAWLnetsPackage.PLACE_MARKING__PLACE:
				setPlace((Place)null);
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
			case YAWLnetsPackage.PLACE_MARKING__TEXT:
				return text != TEXT_EDEFAULT;
			case YAWLnetsPackage.PLACE_MARKING__PLACE:
				return getPlace() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //PlaceMarkingImpl
