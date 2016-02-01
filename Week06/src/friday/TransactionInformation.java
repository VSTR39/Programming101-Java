package friday;

public class TransactionInformation {
	private Integer mBenefactorID;
	private Integer mRecipientID;
	private Double mBalanceBeforeTransaction;
	private Double mBalanceAfterTransaction;

	public TransactionInformation() {
		mBenefactorID = null;
		mRecipientID = null;
		mBalanceBeforeTransaction = null;
		mBalanceAfterTransaction = null;
	}

	public TransactionInformation(Integer benefactorID, Integer recipientID, Double balanceBeforeTransaction,
			Double balanceAfterTransaction) {
		this.mBenefactorID = benefactorID;
		this.mRecipientID = recipientID;
		this.mBalanceBeforeTransaction = balanceBeforeTransaction;
		this.mBalanceAfterTransaction = balanceAfterTransaction;
	}

	public Integer getBenefactorID() {
		return mBenefactorID;
	}

	public void setBenefactorID(Integer mBenefactorID) {
		this.mBenefactorID = mBenefactorID;
	}

	public Integer getRecipientID() {
		return mRecipientID;
	}

	public void setRecipientID(Integer mRecipientID) {
		this.mRecipientID = mRecipientID;
	}

	public Double getBalanceBeforeTransaction() {
		return this.mBalanceBeforeTransaction;
	}

	public void setBalanceBeforeTransaction(Double mBalanceBeforeTransaction) {
		this.mBalanceBeforeTransaction = mBalanceBeforeTransaction;
	}

	public Double getBalanceAfterTransaction() {
		return this.mBalanceAfterTransaction;
	}

	public void setBalanceAfterTransaction(Double mBalanceAfterTransaction) {
		this.mBalanceAfterTransaction = mBalanceAfterTransaction;
	}
	
}
