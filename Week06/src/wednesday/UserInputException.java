package wednesday;

public class UserInputException extends Exception {

	private static final long serialVersionUID = 1L;
	private String mExceptionText;

	public UserInputException() {
		mExceptionText = "UserInputException";
	}

	public UserInputException(String exceptionText) {
		mExceptionText = exceptionText;
	}

	public String getExceptionText() {
		return mExceptionText;
	}

}
