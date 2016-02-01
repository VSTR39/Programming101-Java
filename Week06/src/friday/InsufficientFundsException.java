package friday;

public class InsufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4028273504015001715L;
	private String mExceptionText;

	public InsufficientFundsException() {
		mExceptionText = "InsufficientFundsException";
	}

	public InsufficientFundsException(String exceptionText) {
		mExceptionText = exceptionText;
	}

	public String getExceptionText() {
		return mExceptionText;
	}
}
