package com.daya.StreamsFilteringAndMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MappingAndFilteringStreams {

	public static void main(String[] args) {

		List<Student> list  = new ArrayList<>();
		
		list.add(new Student("Dayasagara", 23));
		list.add(new Student("Gagan", 26));
		list.add(new Student("Susheel", 23));
		list.add(new Student("Chetan", 21));
		list.add(new Student("Nitin", 22));
		list.add(new Student("Sparsh", 23));
		list.add(new Student("Vishnu", 24));
		
		Stream<Student> filteredList = list.stream().filter(s->s.getAge()>22);
		filteredList.forEach(System.out::println);
		
		System.out.println("-------------------");
		
		boolean allMatch = list.stream().allMatch(s->s.getName().contains("a"));
		System.out.println(allMatch);
		
		System.out.println("-------------------");
		boolean anyMatch = list.stream().anyMatch(s->s.getAge()>35);
		System.out.println(anyMatch);
		System.out.println("-------------------");
		boolean noneMatch = list.stream().noneMatch(s->s.getAge()>30);
		System.out.println(noneMatch);
	}

}
