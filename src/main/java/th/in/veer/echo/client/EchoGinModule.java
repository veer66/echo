package th.in.veer.echo.client;

import com.google.gwt.inject.client.AbstractGinModule;

/**
 * Created with IntelliJ IDEA.
 * User: vee
 * Date: 2/19/13 AD
 * Time: 5:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class EchoGinModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(EchoView.class).to(EchoViewImpl.class);
    }
}
