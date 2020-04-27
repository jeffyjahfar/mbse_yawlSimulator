/**
 * 
 */
package mbse.project.yawl.graphics.figures;


import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import mbse.project.YAWLnets.Place;
import mbse.project.YAWLnets.PlaceTypes;
import mbse.project.YAWLnets.YAWLnet;

/**
 * @author jeffy s155191
 * @generated NOT
 */
public class StartEndConditions extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();

		if (object instanceof YAWLnet) {
			EObject container = object.eContainer();
			if (container instanceof PetriNet) {
				int startCount = 0;
				int endCount = 0;
				Iterator<EObject> iterator = container.eAllContents();
				while (iterator.hasNext()) {
					EObject content = iterator.next();

					// TODO count number of places that are start places
					//      and number of places that are end places
					if(content instanceof Place){
						if((((Place)content).getMarking().getText()) == PlaceTypes.START){
							startCount +=1;
						}
						if((((Place)content).getMarking().getText()) == PlaceTypes.END){
							endCount +=1;
						}	
						
					}

				}
				if (startCount != 1 || endCount != 1) {
					// if there is not exactly one start place and exactly one
					// end place, return a failure status.
					return ctx.createFailureStatus(new Object[] {container});
					
				}
				
			}

		} 
		// otherwise return a success status
		return ctx.createSuccessStatus();
	}

}