package com.daya.StreamCreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {

		String arr[]= new String[]{"Daya","Gagan","Susheel"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		
		Stream<String> stream1 = Stream.of("A","B","C","D");
		System.out.println("----------------------");
		stream1.forEach(System.out::println);
		
		List<String> list = new ArrayList<>();
		list.add("Dayasagara");
		list.add("Susheel");
		list.add("Gagan");
		
		System.out.println("----------------------");
		Stream<String> stream2 = list.stream();
		
		stream2.forEach(System.out::println);
	}

}
