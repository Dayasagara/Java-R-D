package com.daya.ParkingService;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class ParkingApp {
	public static Map<Integer, CustomerDetails> parkingMap = new HashMap<>();
	
	int carCount = 110;
	public int parkByCar(CustomerDetails customer) {
		if(carCount%100==49)
		{
			carCount+=61;
		}
		parkingMap.put(carCount++, customer);
		return carCount;
	}
	
	public static String stripId(int carCount)
	{
		int temp=carCount;
		int sectionCount=(temp%100)/10;
		int floorCount=temp/100;
		int parkingId=(carCount%10)%10;
		return "Floor No. "+floorCount+"Section No"+sectionCount+"Compartment"+parkingId;
		
	}

	public static void main(String[] args) {
		ParkingApp park = new ParkingApp();
		CustomerDetails customer = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer);
		CustomerDetails customer1 = new CustomerDetails("Susheel", "1234567891", "06:30");
		park.parkByCar(customer1);
		CustomerDetails customer2 = new CustomerDetails("Gagan", "1234567891", "04:30");
		park.parkByCar(customer2);
		CustomerDetails customer3 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer3);
		CustomerDetails customer4 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer4);
		CustomerDetails customer5 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer5);
		CustomerDetails customer6 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer6);		
		CustomerDetails customer7 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer7);
		CustomerDetails customer8 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer8);
		CustomerDetails customer9 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer9);
		CustomerDetails customer10 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer10);
		CustomerDetails customer11 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer11);
		CustomerDetails customer12 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer12);
		CustomerDetails customer13 = new CustomerDetails("Daya", "1234567890", "12:30");
		park.parkByCar(customer13);

		for (Map.Entry<Integer, CustomerDetails> entry : parkingMap.entrySet()) {
			Integer key = entry.getKey();
			System.out.println(key);
			System.out.println(stripId(key));
			System.out.println(entry.getValue().getCustomerName());
			System.out.println(entry.getValue().getPhoneNo());
			System.out.println(entry.getValue().getParkTime());
		}
		
		parkingMap.remove(110);
		for (Map.Entry<Integer, CustomerDetails> entry : parkingMap.entrySet()) {
			Integer key = entry.getKey();
			System.out.println(key);
			System.out.println(stripId(key));
			System.out.println(entry.getValue().getCustomerName());
			System.out.println(entry.getValue().getPhoneNo());
			System.out.println(entry.getValue().getParkTime());
			
		}
		
	}
}
