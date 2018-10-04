package com.daya.flight.MakeMyTrip;

import java.util.ArrayList;

import com.daya.flight.pojo.FlightsPojo;

/**
 * Hello world!
 *
 */
public class MakeMyTrip 
{
    public static void main( String[] args )
    {
       	FlightDetails flights=new FlightDetails();
    	FlightsPojo flight1=new FlightsPojo(1,"Air Asia",1230,1500,2500,"Bangalore","Mumbai",150);
    	FlightsPojo flight2=new FlightsPojo(2,"Air Asia",1230,1500,2412,"Bangalore","Mumbai",150);
    	FlightsPojo flight3=new FlightsPojo(3,"Air India",1630,1945,2987,"Bangalore","Delhi",165);
    	flights.addFlightDetails(flight1);
    	flights.addFlightDetails(flight2);
    	flights.addFlightDetails(flight3);
    	ArrayList<FlightsPojo> flightsList1=flights.getFlightDetails();
    	for(FlightsPojo flightDetails:flightsList1) {
    		System.out.println(flightDetails);
    	}
    	flights.removeFlightById(1);
    	ArrayList<FlightsPojo> flightsList3=flights.getFlightDetails();
    	for(FlightsPojo flightDetails:flightsList3) {
    		System.out.println(flightDetails);
    	}
    	/*ArrayList<FlightsPojo> flightsList4=flights.sortByCheapestFare("Bangalore","Mumbai");
    	for(FlightsPojo flightDetails:flightsList4) {
    		System.out.println(flightDetails);
    	}*/
    	ArrayList<FlightsPojo> flightsList5=flights.updateDestination(1,"Delhi");
    	for(FlightsPojo flightDetails:flightsList5) {
    		System.out.println(flightDetails);
    	}
    	ArrayList<FlightsPojo> flightsList6=flights.updateTime(1,600,900);
    	for(FlightsPojo flightDetails:flightsList6) {
    		System.out.println(flightDetails);
    	}
    	
    	ArrayList<FlightsPojo> flightsList7=flights.sortByCheapestFare("Bangalore","Delhi");
    	for(FlightsPojo flightDetails:flightsList7) {
    		System.out.println(flightDetails);
    	}
    	
    }
}
