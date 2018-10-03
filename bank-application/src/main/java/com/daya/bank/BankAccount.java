package com.daya.bank;

/**
 * 
 * @author dayavg
 * @since 03-10-2018
 */
public abstract class BankAccount {

	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;

	public BankAccount() {
		accountNo = ++autoAccountNoGen;
		accountHolderName = "Unknown";
		accountBalance = 0;
	}

	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		accountNo = ++autoAccountNoGen;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public void deposit(double amount)
	{
		accountBalance+=amount;
	}
	
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void withdraw(double amount)
	{
		accountBalance-=amount;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}
}
