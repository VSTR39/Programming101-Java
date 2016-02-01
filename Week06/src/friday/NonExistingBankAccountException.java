package friday;

public class NonExistingBankAccountException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2225248346177078794L;
	private String mExceptionText;

	public NonExistingBankAccountException() {
		mExceptionText = "NonExistingBankAccountException";
	}

	public NonExistingBankAccountException(String exceptionText) {
		mExceptionText = exceptionText;
	}

	public String getExceptionText() {
		return mExceptionText;
	}

}
