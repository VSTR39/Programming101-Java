package friday;

import java.util.ArrayList;

public class AccountInformation {

	private enum InterestType {
		simple("simple"), complex("complex");
		private String mText;

		InterestType(String text) {
			mText = text;
		}
	}

	private double mBalance;
	private InterestType mInterestType;
	private double mInterest;
	private ArrayList<TransactionInformation> mHistory;
	private static int mAccountID = 0;

	public AccountInformation(double balance, InterestType interestType, double interest) throws IllegalDataException {
		setAccountBalance(balance);
		setAccountInterestType(interestType);
		setAccountInterest(interest);
		mHistory = new ArrayList<TransactionInformation>();
		mAccountID++;
	}

	public ArrayList<TransactionInformation> getHistory() {
		return this.mHistory;
	}

	public static int getAccountID() {
		return mAccountID;
	}

	public double getAccountBalance() {
		return this.mBalance;
	}

	public void setAccountBalance(double balance) throws IllegalDataException {
		if (balance < 0) {
			throw new IllegalDataException();
		} else {
			this.mBalance = balance;
		}
	}

	public String getAccountInterestType() {
		return this.mInterestType.mText;
	}

	public void setAccountInterestType(InterestType interestType) {
		this.mInterestType = interestType;
	}

	public double getAccountInterest() {
		return this.mInterest;
	}

	public void setAccountInterest(double interest) throws IllegalDataException {
		if (interest < 0 || interest > 1) {
			throw new IllegalDataException();
		} else {
			this.mInterest = interest;
		}
	}
}
