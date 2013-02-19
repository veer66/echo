package th.in.veer.echo.client;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Created with IntelliJ IDEA.
 * User: vee
 * Date: 2/20/13 AD
 * Time: 1:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class GwtTestecho extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "th.in.veer.echo.echoJUnit";
    }

    public void testFoo() {
        assertTrue(true);
    }
}
