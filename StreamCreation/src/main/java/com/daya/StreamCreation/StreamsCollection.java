package com.daya.StreamCreation;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCollection {

	public static void main(String[] args) {

		/*Stream<String> stream = Stream.of("a","b","c","bb","abc").filter(e->e.contains("bb"));
		Optional<String> findAny = stream.findAny();
		System.out.println(findAny.get());
		Optional<String> findFirst = stream.findFirst();
		*/
		
		List<String> collect = Stream.of("Air India","Air Asia","Go Air","Indigo").filter(e->e.contains("Air")).collect(Collectors.toList());
		
		Optional<String> findAny1 = collect.stream().findAny();
		System.out.println(findAny1.get());//Print AnyOne
		
		Optional<String> findFirst1 = collect.stream().findFirst();
		System.out.println(findFirst1.get());
	}

}