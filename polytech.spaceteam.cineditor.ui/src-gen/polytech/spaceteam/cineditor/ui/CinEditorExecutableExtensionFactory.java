/*
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import polytech.spaceteam.cineditor.ui.internal.CineditorActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CinEditorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(CineditorActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		CineditorActivator activator = CineditorActivator.getInstance();
		return activator != null ? activator.getInjector(CineditorActivator.POLYTECH_SPACETEAM_CINEDITOR_CINEDITOR) : null;
	}

}
