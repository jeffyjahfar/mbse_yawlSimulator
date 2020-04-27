/**
 */
package YAWLNetSimulator.impl;

import YAWLNetSimulator.*;

import org.eclipse.emf.ecore.EClass;
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
public class YAWLNetSimulatorFactoryImpl extends EFactoryImpl implements YAWLNetSimulatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YAWLNetSimulatorFactory init() {
		try {
			YAWLNetSimulatorFactory theYAWLNetSimulatorFactory = (YAWLNetSimulatorFactory)EPackage.Registry.INSTANCE.getEFactory(YAWLNetSimulatorPackage.eNS_URI);
			if (theYAWLNetSimulatorFactory != null) {
				return theYAWLNetSimulatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YAWLNetSimulatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLNetSimulatorFactoryImpl() {
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
			case YAWLNetSimulatorPackage.ENABLED_TRANSITION: return createEnabledTransition();
			case YAWLNetSimulatorPackage.WARNING: return createWarning();
			case YAWLNetSimulatorPackage.SELECT_ARC: return createSelectArc();
			case YAWLNetSimulatorPackage.MARKING: return createMarking();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition createEnabledTransition() {
		EnabledTransitionImpl enabledTransition = new EnabledTransitionImpl();
		return enabledTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Warning createWarning() {
		WarningImpl warning = new WarningImpl();
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectArc createSelectArc() {
		SelectArcImpl selectArc = new SelectArcImpl();
		return selectArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marking createMarking() {
		MarkingImpl marking = new MarkingImpl();
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLNetSimulatorPackage getYAWLNetSimulatorPackage() {
		return (YAWLNetSimulatorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YAWLNetSimulatorPackage getPackage() {
		return YAWLNetSimulatorPackage.eINSTANCE;
	}

} //YAWLNetSimulatorFactoryImpl
