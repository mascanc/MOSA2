/*
 * generated by Xtext 2.17.0
 */
package com.spirit.ihe


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class IHEStandaloneSetup extends IHEStandaloneSetupGenerated {

	def static void doSetup() {
		new IHEStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
