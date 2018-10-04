package com.daya.flight.MakeMyTrip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



import com.daya.flight.pojo.FlightsPojo;

public class FlightDetails {
	ArrayList<FlightsPojo> flightsList=new ArrayList<FlightsPojo>();
	

	public void addFlightDetails(FlightsPojo flight) {
		flightsList.add(flight);
	}
	
	public ArrayList<FlightsPojo> removeFlightById(int flightNo) {
		for(FlightsPojo remove:flightsList) {
			if(remove.getFlightNo()==flightNo) {
				return flightsList;
			}
		}
		throw new RuntimeException("Flight doesn't exist");
	}

	public ArrayList<FlightsPojo> getFlightDetails() {
		return flightsList;
	}

	public ArrayList<FlightsPojo> updateDestination(int flightId,String destination){
		for(FlightsPojo update:flightsList) {
			if(update.getFlightNo()==flightId) {
				update.setDestination(destination);
				return flightsList;
			}
		}
		throw new RuntimeException("Flight doesn't exist");
	}
	
	public ArrayList<FlightsPojo> updateTime(int flightId,int arrivalTime,int departTime){
		for(FlightsPojo update:flightsList) {
			if(update.getFlightNo()==flightId) {
				update.setArrivalTime(arrivalTime);
				update.setDepartTime(departTime);
				return flightsList;
			}
		}
		throw new RuntimeException("Flight doesn't exist");
	}
	
	public ArrayList<FlightsPojo> sortByCheapestFare(String source, String destination) {
		for(FlightsPojo sortFlight:flightsList) {
			if(source.equals(sortFlight.getSource())&&destination.equals(sortFlight.getDestination())) {
				Collections.sort(flightsList, new Comparator<FlightsPojo>() {
					public int compare(FlightsPojo acc1,FlightsPojo acc2) {
						return acc1.getCost()-(acc2.getCost());
					}
				});
				
			}
			
		}
		return flightsList;
	}
}
