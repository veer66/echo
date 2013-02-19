package th.in.veer.echo.client;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GreetingView extends Composite implements GreetingPresenter.Display {
	
	private final TextBox messageBox;
	private final Button helloButton;
	private final TextBox messageFromServerBox;

	public GreetingView() {
		VerticalPanel verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);
		messageBox = new TextBox();
		verticalPanel.add(messageBox);
		helloButton = new Button("Hello");
		verticalPanel.add(helloButton);
		messageFromServerBox = new TextBox();
		verticalPanel.add(messageFromServerBox);
	}
	

	public HasValue<String> getName() {
		return messageBox;
	}

	public HasClickHandlers getHelloButton() {
		return helloButton;
	}

	public void setMessage(String message) {
		messageFromServerBox.setText(message);
	}
}
