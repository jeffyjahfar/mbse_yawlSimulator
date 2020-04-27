/**
 */
package mbse.project.YAWLnets.impl;

import mbse.project.YAWLnets.Arc;
import mbse.project.YAWLnets.ArcType;
import mbse.project.YAWLnets.ArcTypes;
import mbse.project.YAWLnets.JoinType;
import mbse.project.YAWLnets.JoinTypes;
import mbse.project.YAWLnets.Place;
import mbse.project.YAWLnets.PlaceMarking;
import mbse.project.YAWLnets.PlaceTypes;
import mbse.project.YAWLnets.SplitType;
import mbse.project.YAWLnets.SplitTypes;
import mbse.project.YAWLnets.Transition;
import mbse.project.YAWLnets.YAWLnet;
import mbse.project.YAWLnets.YAWLnetsFactory;
import mbse.project.YAWLnets.YAWLnetsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YAWLnetsPackageImpl extends EPackageImpl implements YAWLnetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yawLnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeMarkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arcTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum splitTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum joinTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placeTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mbse.project.YAWLnets.YAWLnetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YAWLnetsPackageImpl() {
		super(eNS_URI, YAWLnetsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link YAWLnetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static YAWLnetsPackage init() {
		if (isInited) return (YAWLnetsPackage)EPackage.Registry.INSTANCE.getEPackage(YAWLnetsPackage.eNS_URI);

		// Obtain or create and register package
		YAWLnetsPackageImpl theYAWLnetsPackage = (YAWLnetsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof YAWLnetsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new YAWLnetsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PnmlcoremodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theYAWLnetsPackage.createPackageContents();

		// Initialize created meta-data
		theYAWLnetsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theYAWLnetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(YAWLnetsPackage.eNS_URI, theYAWLnetsPackage);
		return theYAWLnetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYAWLnet() {
		return yawLnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Splittype() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Jointype() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Marking() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Type() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcType() {
		return arcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcType_Text() {
		return (EAttribute)arcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArcType_Arc() {
		return (EReference)arcTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceMarking() {
		return placeMarkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceMarking_Text() {
		return (EAttribute)placeMarkingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceMarking_Place() {
		return (EReference)placeMarkingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitType() {
		return splitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplitType_Text() {
		return (EAttribute)splitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitType_Transition() {
		return (EReference)splitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinType() {
		return joinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinType_Text() {
		return (EAttribute)joinTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinType_Transition() {
		return (EReference)joinTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArcTypes() {
		return arcTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSplitTypes() {
		return splitTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJoinTypes() {
		return joinTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlaceTypes() {
		return placeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLnetsFactory getYAWLnetsFactory() {
		return (YAWLnetsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		yawLnetEClass = createEClass(YAW_LNET);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SPLITTYPE);
		createEReference(transitionEClass, TRANSITION__JOINTYPE);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__MARKING);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__TYPE);

		arcTypeEClass = createEClass(ARC_TYPE);
		createEAttribute(arcTypeEClass, ARC_TYPE__TEXT);
		createEReference(arcTypeEClass, ARC_TYPE__ARC);

		placeMarkingEClass = createEClass(PLACE_MARKING);
		createEAttribute(placeMarkingEClass, PLACE_MARKING__TEXT);
		createEReference(placeMarkingEClass, PLACE_MARKING__PLACE);

		splitTypeEClass = createEClass(SPLIT_TYPE);
		createEAttribute(splitTypeEClass, SPLIT_TYPE__TEXT);
		createEReference(splitTypeEClass, SPLIT_TYPE__TRANSITION);

		joinTypeEClass = createEClass(JOIN_TYPE);
		createEAttribute(joinTypeEClass, JOIN_TYPE__TEXT);
		createEReference(joinTypeEClass, JOIN_TYPE__TRANSITION);

		// Create enums
		arcTypesEEnum = createEEnum(ARC_TYPES);
		splitTypesEEnum = createEEnum(SPLIT_TYPES);
		joinTypesEEnum = createEEnum(JOIN_TYPES);
		placeTypesEEnum = createEEnum(PLACE_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yawLnetEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());
		transitionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getTransition());
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		arcTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		placeMarkingEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		splitTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		joinTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(yawLnetEClass, YAWLnet.class, "YAWLnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Splittype(), this.getSplitType(), this.getSplitType_Transition(), "splittype", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Jointype(), this.getJoinType(), this.getJoinType_Transition(), "jointype", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_Marking(), this.getPlaceMarking(), this.getPlaceMarking_Place(), "marking", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Type(), this.getArcType(), this.getArcType_Arc(), "type", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcTypeEClass, ArcType.class, "ArcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcType_Text(), this.getArcTypes(), "text", null, 0, 1, ArcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArcType_Arc(), this.getArc(), this.getArc_Type(), "arc", null, 0, 1, ArcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeMarkingEClass, PlaceMarking.class, "PlaceMarking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceMarking_Text(), this.getPlaceTypes(), "text", null, 0, 1, PlaceMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaceMarking_Place(), this.getPlace(), this.getPlace_Marking(), "place", null, 0, 1, PlaceMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitTypeEClass, SplitType.class, "SplitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSplitType_Text(), this.getSplitTypes(), "text", null, 0, 1, SplitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSplitType_Transition(), this.getTransition(), this.getTransition_Splittype(), "transition", null, 0, 1, SplitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinTypeEClass, JoinType.class, "JoinType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinType_Text(), this.getJoinTypes(), "text", null, 0, 1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinType_Transition(), this.getTransition(), this.getTransition_Jointype(), "transition", null, 0, 1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arcTypesEEnum, ArcTypes.class, "ArcTypes");
		addEEnumLiteral(arcTypesEEnum, ArcTypes.NORMAL);
		addEEnumLiteral(arcTypesEEnum, ArcTypes.RESET);

		initEEnum(splitTypesEEnum, SplitTypes.class, "SplitTypes");
		addEEnumLiteral(splitTypesEEnum, SplitTypes.XOR);
		addEEnumLiteral(splitTypesEEnum, SplitTypes.AND);
		addEEnumLiteral(splitTypesEEnum, SplitTypes.OR);
		addEEnumLiteral(splitTypesEEnum, SplitTypes.SINGLE);

		initEEnum(joinTypesEEnum, JoinTypes.class, "JoinTypes");
		addEEnumLiteral(joinTypesEEnum, JoinTypes.XOR);
		addEEnumLiteral(joinTypesEEnum, JoinTypes.AND);
		addEEnumLiteral(joinTypesEEnum, JoinTypes.OR);
		addEEnumLiteral(joinTypesEEnum, JoinTypes.SINGLE);

		initEEnum(placeTypesEEnum, PlaceTypes.class, "PlaceTypes");
		addEEnumLiteral(placeTypesEEnum, PlaceTypes.START);
		addEEnumLiteral(placeTypesEEnum, PlaceTypes.END);
		addEEnumLiteral(placeTypesEEnum, PlaceTypes.NORMAL);

		// Create resource
		createResource(eNS_URI);
	}

} //YAWLnetsPackageImpl
