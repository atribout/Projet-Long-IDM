/*
 * generated by Xtext 2.23.0
 */
package fr.n7.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.n7.xtext.GameRuntimeModule;
import fr.n7.xtext.GameStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class GameIdeSetup extends GameStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GameRuntimeModule(), new GameIdeModule()));
	}
	
}
