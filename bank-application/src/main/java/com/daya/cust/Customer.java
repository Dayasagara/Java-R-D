package com.daya.cust;

import com.daya.bank.BankAccount;
import com.daya.bank.CurrentAccount;
import com.daya.bank.CurrentAccount1;
import com.daya.bank.SavingsAccount;
import com.daya.bank.SavingsAccount1;

public class Customer {

	public static void main(String... args) {
		BankAccount acc = null;
		acc = new SavingsAccount();
		acc.withdraw(5000);
		acc.deposit(2000);
		acc = new CurrentAccount();
		acc.withdraw(2000);
		SavingsAccount1 acc1 = new SavingsAccount1();
		System.out.println(acc1.getInsuranceName());
		System.out.println(acc1.getInsuranceAmount());
		CurrentAccount1 acc2 = new CurrentAccount1();
		System.out.println(acc2.getInsuranceName());
		System.out.println(acc2.getInsuranceAmount());
		/* acc.isSalaryAccount(); */
	}
}
