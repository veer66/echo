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

public class EchoPresenter implements Presenter {
	public interface Display {
		HasValue<String> getInputMessage();

		HasClickHandlers getRunButton();

		void setMessage(String message);

		Widget asWidget();
	}

	private final HandlerManager eventBus;
	private final EchoServiceAsync rpcService;
	private Display display;

	public EchoPresenter(EchoServiceAsync rpcService,
                         HandlerManager eventBus, Display display) {
		this.eventBus = eventBus;
		this.rpcService = rpcService;
		this.display = display;
		bind();
	}

	public void go(HasWidgets container) {
		container.clear();
		container.add(display.asWidget());
	}

	private void bind() {
		display.getRunButton().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                rpcService.sendMessage(display.getInputMessage().getValue(),
                        new AsyncCallback<String>() {
                            public void onSuccess(String result) {
                                display.setMessage(result);
                            }

                            public void onFailure(Throwable caught) {
                                Window.alert(caught.getMessage());
                            }
                        });
            }
        });
	}
}
