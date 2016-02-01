package wednesday;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputChecker {
	private String mUserInput;

	public UserInputChecker(String userInput) {
		mUserInput = userInput;
	}

	public void setUsetInput(String userInput) {
		mUserInput = userInput;
	}

	public String getUserInput() {
		return mUserInput;
	}

	interface Validator {
		public boolean validate(String userInput);
	}

	class PersonNameValidator extends UserInputChecker implements Validator {

		public PersonNameValidator(String userInput) {
			super(userInput);
		}

		public boolean validate(String userInput) {
			boolean result = true;
			int i = 0;
			for (i = 0; i < userInput.length(); i++) {
				if (!Character.isAlphabetic(userInput.charAt(i))) {
					return false;
				}
			}

			if (userInput.length() < 2) {
				return false;
			}
			return result;
		}
	};

	public boolean isValidUserName() {
		PersonNameValidator validator = new PersonNameValidator(this.getUserInput());
		boolean result = validator.validate(this.getUserInput());
		return result;
	}

	class BulgarianPhoneNumberValidator extends UserInputChecker implements Validator {

		public BulgarianPhoneNumberValidator(String userInput) {
			super(userInput);
		}

		public boolean validate(String userInput) {
			boolean result = true;
			if (userInput.length() != 7 && userInput.length() != 9 && userInput.length() != 11) {
				return false;
			}
			if (userInput.length() == 9 && !(userInput.substring(0, 1).equals("02"))) {
				return false;
			}

			if (userInput.length() == 11 && !(userInput.substring(0, 2).equals("359"))) {
				return false;
			}

			for (int i = 0; i < userInput.length(); i++) {
				if (!Character.isDigit(userInput.charAt(i))) {
					return false;
				}
			}
			return result;
		}
	};

	public boolean isValidBulgarianPhoneNumber() {
		BulgarianPhoneNumberValidator validator = new BulgarianPhoneNumberValidator(this.getUserInput());
		return validator.validate(this.getUserInput());
	}

	class PersonAgeValidator extends UserInputChecker implements Validator {
		public PersonAgeValidator(String userInput) {
			super(userInput);
		}

		public boolean validate(String userInput) {
			boolean result = true;
			for (int i = 0; i < userInput.length(); i++) {
				if (!Character.isDigit(userInput.charAt(i))) {
					return false;
				}
			}
			if (userInput.length() > 3) {
				return false;
			}
			if (userInput.length() == 3 && ((userInput.charAt(0) != 1) || (userInput.charAt(1) != 1))) {
				return false;
			}
			return result;
		}
	};

	public boolean isValidPersonAge() {
		PersonAgeValidator validator = new PersonAgeValidator(this.getUserInput());
		return validator.validate(this.getUserInput());
	}

	class CreditCardNumberValidator extends UserInputChecker implements Validator {
		public CreditCardNumberValidator(String userInput) {
			super(userInput);
		}

		private int charToIntConverter(char character) throws UserInputException {
			switch (character) {
			case '0': {
				return 0;
			}
			case '1': {
				return 1;
			}
			case '2': {
				return 2;
			}
			case '3': {
				return 3;
			}
			case '4': {
				return 4;
			}
			case '5': {
				return 5;
			}
			case '6': {
				return 6;
			}
			case '7': {
				return 7;
			}
			case '8': {
				return 8;
			}
			case '9': {
				return 9;
			}

			default: {
				throw new UserInputException("Not a Valid Character");
			}
			}

		}

		private boolean isEven(int number) {
			return (number % 2 == 0);
		}

		public boolean validate(String userInput) {
			boolean result = true;
			int luhnSum = 0;
			for (int i = 0; i < userInput.length(); i++) {
				if (isEven(i + 1)) {
					try {
						luhnSum = luhnSum + charToIntConverter(userInput.charAt(i)) * 2;
					} catch (UserInputException e) {
						return false;
					}
				} else {
					try {
						luhnSum = luhnSum + charToIntConverter(userInput.charAt(i));
					} catch (UserInputException e) {
						return false;
					}
				}
			}

			try {
				if ((luhnSum - charToIntConverter(userInput.charAt(userInput.length() - 1))) % 10 == 0) {
					result = true;
				} else {
					result = false;
				}
			} catch (UserInputException e) {
				return false;
			}
			return result;
		}
	};

	public boolean isValidCreditCardNumber() {
		CreditCardNumberValidator validator = new CreditCardNumberValidator(this.getUserInput());
		return validator.validate(this.getUserInput());
	}

	// At this point I remembered that there were these funny things called
	// regular expressions
	class IPVersion4Validator extends UserInputChecker implements Validator {
		public static final String IPV4REGEX = "\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z";

		public IPVersion4Validator(String userInput) {
			super(userInput);
		}

		public boolean validate(String userInput) {
			Pattern pattern = Pattern.compile(IPV4REGEX);
			Matcher matcher = pattern.matcher(userInput);
			return matcher.matches();
		}
	};

	public boolean isValidIPVersion4() {
		IPVersion4Validator validator = new IPVersion4Validator(this.getUserInput());
		return validator.validate(this.getUserInput());
	}

	class IPVersion6Validator extends UserInputChecker implements Validator {
		public static final String IPV6REGEX = "\\A(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}\\z";

		public IPVersion6Validator(String userInput) {
			super(userInput);
		}

		public boolean validate(String userInput) {
			Pattern pattern = Pattern.compile(IPV6REGEX);
			Matcher matcher = pattern.matcher(userInput);
			return matcher.matches();
		}
	};

	public boolean isValidIPVersion6() {
		IPVersion6Validator validator = new IPVersion6Validator(this.getUserInput());
		return validator.validate(this.getUserInput());
	}

	class MacAddressValidator extends UserInputChecker implements Validator {
		public static final String MacAddressREGEX = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";

		public MacAddressValidator(String userInput) {
			super(userInput);
		}

		public boolean validate(String userInput) {
			Pattern pattern = Pattern.compile(MacAddressREGEX);
			Matcher matcher = pattern.matcher(userInput);
			return matcher.matches();
		}
	};

	public boolean isValidMacAddress() {
		MacAddressValidator validator = new MacAddressValidator(this.getUserInput());
		return validator.validate(this.getUserInput());
	}

}
