package th.in.veer.echo.client;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EchoViewImpl extends Composite implements EchoView {
	
	private final TextBox inputMessageBox;
	private final Button runButton;
	private final TextBox messageFromServerBox;

	public EchoViewImpl() {
		VerticalPanel verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);
		inputMessageBox = new TextBox();
		verticalPanel.add(inputMessageBox);
		runButton = new Button("Run");
		verticalPanel.add(runButton);
		messageFromServerBox = new TextBox();
		verticalPanel.add(messageFromServerBox);
	}

    public String getInputMessage() {
        return null;
    }

    public void setEchoMessage(String message) {
        messageFromServerBox.setText(message);
    }

	public void setMessage(String message) {
		messageFromServerBox.setText(message);
	}
}
