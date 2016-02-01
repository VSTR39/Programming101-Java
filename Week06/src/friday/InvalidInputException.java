package friday;

public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5177256426254410881L;
	private String mExceptionText;

	public InvalidInputException() {
		mExceptionText = "InvalidInputException";
	}

	public InvalidInputException(String exceptionText) {
		mExceptionText = exceptionText;
	}

	public String getExceptionText() {
		return mExceptionText;
	}
}
