package freitag;

import java.util.Scanner;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class JaasExample {
	public static void main(String[] args) {
		System.out.println("blabla first Jaas");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter username:");
		String username = scan.next();
		System.out.println("Enter password");
		String password = scan.next();
		System.setProperty("java.security,auth.login.config", "jaas.config");
		try {
			LoginContext lc = new LoginContext("JaasConfiguration", new MyCustomCallbackHandler(username, password));
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
