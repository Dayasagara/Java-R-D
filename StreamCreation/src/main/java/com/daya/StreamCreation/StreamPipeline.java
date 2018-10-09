package com.daya.StreamCreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipeline {

	public static void main(String[] args) {

		Stream<String> onceModifiedStream =Stream.of("user1", "data2", "info3").skip(1);
		onceModifiedStream.forEach(System.out::println);
		System.out.println("------------------------------------------------------");
		
		Stream<String> stream =Stream.of("user1", "data2", "info3");
		Stream<String> twiceModifiedStream =stream.skip(1).map(element -> element.substring(0, 4));
		twiceModifiedStream.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------");
		List<String> list = Arrays.asList("user1", "data2", "info3");
	    long size = list.stream().skip(1).map(element -> element.substring(0, 4)).sorted().count();
	    System.out.println(size);

	}

}
