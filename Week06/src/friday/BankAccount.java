package friday;

import java.util.ArrayList;

public class BankAccount {

	private Person mOwner;
	private AccountInformation mAccountInformation;
	private int mLastOperation = 0;

	public BankAccount(Person owner, AccountInformation accountInformation) throws IllegalDataException {
		setAccountOwner(owner);
		setAccountInformation(accountInformation);

	}

	public Person getAccountOwner() {
		return this.mOwner;
	}

	public void setAccountOwner(Person owner) throws IllegalDataException {
		this.mOwner = owner;
	}

	public AccountInformation getAccountInformation() {
		return this.mAccountInformation;
	}

	public void setAccountInformation(AccountInformation accountInformation) throws IllegalDataException {
		this.mAccountInformation = accountInformation;
	}

	public void addMoney(double sum) throws IllegalDataException {
		if (sum < 0) {
			throw new IllegalDataException();
		} else {
			double result = this.mAccountInformation.getAccountBalance() + sum;
			mLastOperation++;
			updateHistory(this.mAccountInformation, result);
			this.mAccountInformation.setAccountBalance(result);
		}
	}

	public void withdrawMoney(double sum)
			throws IllegalDataException, AccountBlockedException, InsufficientFundsException {
		if (sum < 0) {
			throw new IllegalDataException();
		} else if (this.mAccountInformation.getAccountInterest() > 0.01) {
			throw new AccountBlockedException();
		} else if ((this.mAccountInformation.getAccountBalance() - sum) < 0) {
			throw new InsufficientFundsException();
		} else {
			double result = mAccountInformation.getAccountBalance() - sum;
			mLastOperation++;
			updateHistory(this.mAccountInformation, result);
			this.mAccountInformation.setAccountBalance(result);
		}
	}

	public void transferMoney(AccountInformation benefactorAccountInformation,
			AccountInformation recipientAccountInformation, double sum)
					throws IllegalDataException, AccountBlockedException, InsufficientFundsException {
		if (benefactorAccountInformation.getAccountInterest() > 0.01
				|| recipientAccountInformation.getAccountInterest() > 0.01) {
			throw new AccountBlockedException();
		} else if (sum < 0) {
			throw new IllegalDataException();
		} else if ((benefactorAccountInformation.getAccountBalance() - sum) < 0) {
			throw new InsufficientFundsException();
		} else {
			double benefactorResult = benefactorAccountInformation.getAccountBalance() - sum;
			double recipientResult = recipientAccountInformation.getAccountBalance() + sum;
			mLastOperation++;
			updateHistory(benefactorAccountInformation, recipientAccountInformation, benefactorResult, recipientResult);
			benefactorAccountInformation.setAccountBalance(benefactorResult);
			recipientAccountInformation.setAccountBalance(recipientResult);
		}
	}

	public void updateHistory(AccountInformation benefactorAccountInformation,
			AccountInformation recipientAccountInformation, double benefactorResult, double recipientResult) {
		benefactorAccountInformation.getHistory()
				.add(new TransactionInformation(benefactorAccountInformation.getAccountID(),
						recipientAccountInformation.getAccountID(), benefactorAccountInformation.getAccountBalance(),
						benefactorResult));
		recipientAccountInformation.getHistory()
				.add(new TransactionInformation(benefactorAccountInformation.getAccountID(),
						recipientAccountInformation.getAccountID(), recipientAccountInformation.getAccountBalance(),
						recipientResult));
	}

	public void updateHistory(AccountInformation accountInformation, double result) {
		accountInformation.getHistory().add(new TransactionInformation(accountInformation.getAccountID(),
				accountInformation.getAccountID(), accountInformation.getAccountBalance(), result));
	}
}
