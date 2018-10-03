package com.daya.bank;

public class SavingsAccount1 extends SavingsAccount implements Insurance {

	public String getInsuranceName() {

		return "LIC";
	}

	public double getInsuranceAmount() {

		return 500000;
	}

}
