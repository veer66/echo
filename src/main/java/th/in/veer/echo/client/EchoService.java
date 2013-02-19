package th.in.veer.echo.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("echo")
public interface EchoService extends RemoteService {
	String sendMessage(String name) throws IllegalArgumentException;
}
