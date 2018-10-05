package com.daya.ParkingService;

public class CustomerDetails {
	String customerName,phoneNo,parkTime;

	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetails(String customerName, String phoneNo, String parkTime) {
		super();
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.parkTime = parkTime;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getParkTime() {
		return parkTime;
	}

	public void setParkTime(String parkTime) {
		this.parkTime = parkTime;
	}
	
}
