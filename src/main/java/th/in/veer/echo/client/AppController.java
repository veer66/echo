package th.in.veer.echo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

public class AppController implements Presenter, ValueChangeHandler<String> {

	private final HandlerManager eventBus;
	private final EchoServiceAsync rpcService;
	private HasWidgets container;
    private final EchoGinInjector injector = GWT.create(EchoGinInjector.class);

    public AppController(EchoServiceAsync rpcService,
			HandlerManager eventBus) {
		this.eventBus = eventBus;
		this.rpcService = rpcService;
		bind();
	}

	private void bind() {
	}

	public void go(HasWidgets container) {
		this.container = container;
		Presenter presenter = new EchoPresenter(rpcService, eventBus, injector.getEchoView());
		presenter.go(container);
	}

	public void onValueChange(ValueChangeEvent<String> event) {
	}
}
