/*
 * generated by Xtext 2.17.1
 */
package com.spirit.xtext.architecture.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTgfiValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.spirit.xtext.architecture.tgfi.TgfiPackage.eINSTANCE);
		return result;
	}
}
