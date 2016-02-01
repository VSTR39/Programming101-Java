package friday;

public class Person {
	private String mFirstName;
	private String mLastName;
	private int mAge;

	public Person(String firstName, String lastName, int age) throws IllegalDataException {
		setPersonFirstName(firstName);
		setPersonLastName(lastName);
		setPersonAge(age);
	}

	public String getPersonFirstName() {
		return this.mFirstName;
	}

	public void setPersonFirstName(String firstName) throws IllegalDataException {
		for (int i = 0; i < firstName.length(); i++) {
			if (!Character.isAlphabetic(firstName.charAt(i))) {
				throw new IllegalDataException();
			}
		}
		if (firstName.length() < 2) {
			throw new IllegalDataException();
		} else {
			this.mFirstName = firstName;

		}
	}

	public String getPersonLastName() {
		return this.mLastName;
	}

	public void setPersonLastName(String lastName) throws IllegalDataException {
		for (int i = 0; i < lastName.length(); i++) {
			if (!Character.isAlphabetic(lastName.charAt(i))) {
				throw new IllegalDataException();
			}
		}
		if (lastName.length() < 2) {
			throw new IllegalDataException();
		} else {
			this.mLastName = lastName;
		}
	}

	public int getPersonAge() {
		return this.mAge;
	}

	public void setPersonAge(int age) throws IllegalDataException {
		if (age < 0 || age > 116) {
			throw new IllegalDataException();
		} else {
			this.mAge = age;
		}
	}

}
