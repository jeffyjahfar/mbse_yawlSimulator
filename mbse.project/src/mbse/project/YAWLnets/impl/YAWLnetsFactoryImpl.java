/**
 */
package mbse.project.YAWLnets.impl;

import mbse.project.YAWLnets.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YAWLnetsFactoryImpl extends EFactoryImpl implements YAWLnetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YAWLnetsFactory init() {
		try {
			YAWLnetsFactory theYAWLnetsFactory = (YAWLnetsFactory)EPackage.Registry.INSTANCE.getEFactory(YAWLnetsPackage.eNS_URI);
			if (theYAWLnetsFactory != null) {
				return theYAWLnetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YAWLnetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLnetsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case YAWLnetsPackage.YAW_LNET: return createYAWLnet();
			case YAWLnetsPackage.TRANSITION: return createTransition();
			case YAWLnetsPackage.PLACE: return createPlace();
			case YAWLnetsPackage.ARC: return createArc();
			case YAWLnetsPackage.ARC_TYPE: return createArcType();
			case YAWLnetsPackage.PLACE_MARKING: return createPlaceMarking();
			case YAWLnetsPackage.SPLIT_TYPE: return createSplitType();
			case YAWLnetsPackage.JOIN_TYPE: return createJoinType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case YAWLnetsPackage.ARC_TYPES:
				return createArcTypesFromString(eDataType, initialValue);
			case YAWLnetsPackage.SPLIT_TYPES:
				return createSplitTypesFromString(eDataType, initialValue);
			case YAWLnetsPackage.JOIN_TYPES:
				return createJoinTypesFromString(eDataType, initialValue);
			case YAWLnetsPackage.PLACE_TYPES:
				return createPlaceTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case YAWLnetsPackage.ARC_TYPES:
				return convertArcTypesToString(eDataType, instanceValue);
			case YAWLnetsPackage.SPLIT_TYPES:
				return convertSplitTypesToString(eDataType, instanceValue);
			case YAWLnetsPackage.JOIN_TYPES:
				return convertJoinTypesToString(eDataType, instanceValue);
			case YAWLnetsPackage.PLACE_TYPES:
				return convertPlaceTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLnet createYAWLnet() {
		YAWLnetImpl yawLnet = new YAWLnetImpl();
		return yawLnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceMarking createPlaceMarking() {
		PlaceMarkingImpl placeMarking = new PlaceMarkingImpl();
		return placeMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitType createSplitType() {
		SplitTypeImpl splitType = new SplitTypeImpl();
		return splitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType createJoinType() {
		JoinTypeImpl joinType = new JoinTypeImpl();
		return joinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcTypes createArcTypesFromString(EDataType eDataType, String initialValue) {
		ArcTypes result = ArcTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArcTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitTypes createSplitTypesFromString(EDataType eDataType, String initialValue) {
		SplitTypes result = SplitTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSplitTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTypes createJoinTypesFromString(EDataType eDataType, String initialValue) {
		JoinTypes result = JoinTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJoinTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceTypes createPlaceTypesFromString(EDataType eDataType, String initialValue) {
		PlaceTypes result = PlaceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlaceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLnetsPackage getYAWLnetsPackage() {
		return (YAWLnetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YAWLnetsPackage getPackage() {
		return YAWLnetsPackage.eINSTANCE;
	}

} //YAWLnetsFactoryImpl
