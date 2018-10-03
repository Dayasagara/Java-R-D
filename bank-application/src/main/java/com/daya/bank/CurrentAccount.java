package com.daya.bank;

public class CurrentAccount extends BankAccount {

	@Override
	public void withdraw(double amount) {
		System.out.println("Current account withdraw method");
	}

}
