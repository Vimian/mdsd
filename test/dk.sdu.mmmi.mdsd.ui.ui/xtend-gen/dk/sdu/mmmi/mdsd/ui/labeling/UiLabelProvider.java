/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
@SuppressWarnings("all")
public class UiLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public UiLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
