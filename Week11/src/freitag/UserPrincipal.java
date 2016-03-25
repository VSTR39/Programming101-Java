package freitag;

import java.security.Principal;

public class UserPrincipal implements Principal {
	private String mUsername;

	public UserPrincipal(String username) {
		this.mUsername = username;

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
