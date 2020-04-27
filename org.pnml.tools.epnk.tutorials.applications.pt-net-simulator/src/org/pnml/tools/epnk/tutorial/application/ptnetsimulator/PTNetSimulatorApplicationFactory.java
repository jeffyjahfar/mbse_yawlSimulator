package org.pnml.tools.epnk.tutorial.application.ptnetsimulator;

import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import mbse.project.YAWLnets.YAWLnet;

public class PTNetSimulatorApplicationFactory extends ApplicationFactory {

	@Override
	public String getName() {
		// FIXEd: provide a better name here
		return "YAWLNet Simulator";
	}

	@Override
	public String getDescription() {
		return "A very simple YAWLNet simulator as a tutorial for applications";
	}

	@Override
	public boolean isApplicable(PetriNet net) {
		// FIXED: should be replaced by your net type for YAWL Nets
		return net.getType() instanceof YAWLnet;
	}

	@Override
	public ApplicationWithUIManager startApplication(PetriNet net) {
		return new PTNetSimulatorApplication(net);
	}

}
