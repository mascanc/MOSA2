/*
 * generated by Xtext 2.17.1
 */
package com.spirit.xtext.architecture.ui.tests;

import com.google.inject.Injector;
import com.spirit.xtext.architecture.ui.internal.ArchitectureActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class TgfiUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ArchitectureActivator.getInstance().getInjector("com.spirit.xtext.architecture.Tgfi");
	}

}
