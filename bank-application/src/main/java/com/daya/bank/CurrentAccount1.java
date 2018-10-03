package com.daya.bank;

public class CurrentAccount1 extends CurrentAccount implements Insurance {

	public String getInsuranceName() {

		return "UIC";
	}

	public double getInsuranceAmount() {

		return 400000;
	}

}
