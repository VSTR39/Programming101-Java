package friday;

public class AccountBlockedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4447989231649937309L;
	private String mExceptionText;

	public AccountBlockedException() {
		mExceptionText = "AccountBlockedException";
	}

	public AccountBlockedException(String exceptionText) {
		mExceptionText = exceptionText;
	}

	public String getExceptionText() {
		return mExceptionText;
	}
}
