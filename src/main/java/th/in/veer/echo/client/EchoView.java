package th.in.veer.echo.client;

import com.google.gwt.user.client.ui.Widget;


public interface EchoView {
    public Widget asWidget();
    public String getInputMessage();
    public void setEchoMessage(String message);

    public interface Presenter {
        void onRunButtonClicked();
    }
}
