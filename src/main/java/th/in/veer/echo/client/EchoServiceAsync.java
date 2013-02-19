package th.in.veer.echo.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>EchoService</code>.
 */
public interface EchoServiceAsync {
	void sendMessage(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
