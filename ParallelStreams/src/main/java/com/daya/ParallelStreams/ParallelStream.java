package com.daya.ParallelStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.daya.ParallelStreams.Student;

public class ParallelStream {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("Dayasagara", 23));
		list.add(new Student("Gagan", 26));
		list.add(new Student("Susheel", 23));
		list.add(new Student("Chetan", 21));
		list.add(new Student("Nitin", 22));
		list.add(new Student("Sparsh", 23));
		list.add(new Student("Vishnu", 24));

		Stream<Student> filteredList = list.stream().filter(s -> s.getAge() > 25);
		filteredList.forEach(System.out::println);

		boolean anyMatch = list.stream().anyMatch(s -> s.getName().contains("S"));
		System.out.println(anyMatch);

		boolean allMatch = list.stream().allMatch(s -> s.getName().contains("S"));
		System.out.println(allMatch);

		boolean anyMatch2 = list.stream().anyMatch(s -> s.getAge() > 32);
		System.out.println(anyMatch2);

		
		  Stream<Student> parallelStream = list.parallelStream();
		  System.out.println("Students data send for processing:::");
		  parallelStream.forEach(s->doProcess(s));
		 
	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}
}