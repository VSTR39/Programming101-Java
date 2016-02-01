package friday;

public class IllegalDataException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5282017295231371541L;
	private String mExceptionText;

	public IllegalDataException() {
		mExceptionText = "IllegalDataException";
	}

	public IllegalDataException(String exceptionText) {
		mExceptionText = exceptionText;
	}

	public String getExceptionText() {
		return mExceptionText;
	}
}
