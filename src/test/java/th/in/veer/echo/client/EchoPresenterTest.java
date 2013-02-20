package th.in.veer.echo.client;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;
import org.jukito.JukitoRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class EchoPresenterTest {
//    @Inject
//    EchoPresenter.Display view;

    EchoPresenter presenter;
    EchoPresenter.Display echoView;
    EchoServiceAsync rpcService;
    HandlerManager eventBus;
    HasWidgets container;
    @Before
    public void beforeEach() {
        echoView = mock(EchoPresenter.Display.class);
        rpcService = mock(EchoServiceAsync.class);
        eventBus = mock(HandlerManager.class);
        container = mock(HasWidgets.class);
        presenter = new EchoPresenter(rpcService, eventBus, echoView);
        presenter.go(container);
    }

    @Test
    public void testAddingToContainer() throws Exception {

        assertTrue(true);
        verify(echoView).asWidget();
        verify(container).clear();
        verify(container).add(null);
    }

    @Test
    public void testEcho() throws Exception {
//        when(rpcService.sendMessage("MSG1", ))
    }
}
