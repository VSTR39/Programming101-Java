package friday;

public class BankAccountCommandLineInterface {
	private BankAccount mActiveAccount;

	enum Commands {
		start("start"), stop("stop"), create_bank_account("create_bank_account"), show_history(
				"show_history"), add_money("add_money"), withdraw_money("withdraw_money"), transfer_money(
						"transfer_money"), calculate_amount("calculate_amount");

		private String mCommandText;

		private Commands(String commandText) {
			mCommandText = commandText;
		}

	};

	public BankAccountCommandLineInterface() {
		this.mActiveAccount = null;
	}

	public BankAccountCommandLineInterface(BankAccount account) {
		this.mActiveAccount = account;
	}

	public BankAccount getActiveAccount() {
		return this.mActiveAccount;
	}

	public void setActiveAccount(BankAccount account) {
		this.mActiveAccount = account;
	}
}
