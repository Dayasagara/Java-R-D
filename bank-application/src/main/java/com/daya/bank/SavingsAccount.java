package com.daya.bank;

public class SavingsAccount extends BankAccount {

	@Override
	public void withdraw(double amount) {
		System.out.println("Saving account withdraw method");
	}

	public void isSalaryAccount() {
		System.out.println("Salary Account");
	}

}
