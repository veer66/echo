package th.in.veer.echo.client;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EchoView extends Composite implements EchoPresenter.Display {
	
	private final TextBox inputMessageBox;
	private final Button runButton;
	private final TextBox messageFromServerBox;

	public EchoView() {
		VerticalPanel verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);
		inputMessageBox = new TextBox();
		verticalPanel.add(inputMessageBox);
		runButton = new Button("Run");
		verticalPanel.add(runButton);
		messageFromServerBox = new TextBox();
		verticalPanel.add(messageFromServerBox);
	}
	

	public HasValue<String> getInputMessage() {
		return inputMessageBox;
	}

	public HasClickHandlers getRunButton() {
		return runButton;
	}

	public void setMessage(String message) {
		messageFromServerBox.setText(message);
	}
}
