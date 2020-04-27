/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2012 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 */
package org.pnml.tools.epnk.pntypes.signalnets.impl;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;

import org.pnml.tools.epnk.pntypes.signalnets.SignalNet;
import org.pnml.tools.epnk.pntypes.signalnets.SignalnetsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SignalNetImpl extends PetriNetTypeImpl implements SignalNet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalnetsPackage.Literals.SIGNAL_NET;
	}

	/**
	 * URL uniquely identifying this Petri net type (signal nets of the ePNK)
	 * @generated NOT
	 */
	public String toString() {
		return "http://epnk.tools.pnml.org/signalnet/2012";
		
	}
} //SignalNetImpl
