package freitag;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

public class MyCustomCallbackHandler implements CallbackHandler {
	private String mUsername;
	private String mPassword;

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		// TODO Auto-generated method stub
		for (Callback callback : callbacks) {
			if (callback instanceof NameCallback) {
				NameCallback nc = (NameCallback) callback;
				nc.setName(mUsername);
			} else if (callback instanceof PasswordCallback) {
				PasswordCallback pc = (PasswordCallback) callback;
				pc.setPassword(mPassword.toCharArray());
			}
		}
	}

	public MyCustomCallbackHandler(String username, String password) {
		this.mUsername = username;
		this.mPassword = password;
	}

}
