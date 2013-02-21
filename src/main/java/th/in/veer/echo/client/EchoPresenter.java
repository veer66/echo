package th.in.veer.echo.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;


public class EchoPresenter implements Presenter, EchoView.Presenter {

	private final HandlerManager eventBus;
	private final EchoServiceAsync rpcService;
    private final EchoView view;


	public EchoPresenter(EchoServiceAsync rpcService,
                         HandlerManager eventBus, EchoView view) {
		this.eventBus = eventBus;
		this.rpcService = rpcService;
        this.view = view;
	}

	public void go(HasWidgets container) {
		container.clear();
		container.add(view.asWidget());
	}

    public void onRunButtonClicked() {
        rpcService.sendMessage(view.getInputMessage(), new AsyncCallback<String>() {
            public void onFailure(Throwable throwable) {
                view.setEchoMessage("FAIL !!!");
            }
            public void onSuccess(String message) {
                view.setEchoMessage(message);
            }
        });
    }
}
