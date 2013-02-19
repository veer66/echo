package th.in.veer.echo.client;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

/**
 * Created with IntelliJ IDEA.
 * User: vee
 * Date: 2/19/13 AD
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
@GinModules(EchoGinModule.class)
public interface EchoGinInjector extends Ginjector {
    EchoPresenter.Display getEchoView();
}
