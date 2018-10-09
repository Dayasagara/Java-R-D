package com.daya.MappingStream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapping {

	public static void main(String[] args) {

		List<String> uris = new ArrayList<>();
		uris.add("C:\\Myfile1.txt");
		uris.add("D:\\Myfile2.txt");
		uris.add("C:\\Myfile3.txt");
		
		Stream<Path> map = uris.stream().map(uri->Paths.get(uri));
		map.forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		List<PartDetails> partDetailss =new ArrayList<>();
		
		List<String> parts1 = new ArrayList<>();
		parts1.add("Part_1");
		parts1.add("Part_2");
		parts1.add("Part_3");
		
		List<String> parts2 = new ArrayList<>();
		parts2.add("Part_1");
		parts2.add("Part_2");
		parts2.add("Part_3");
		parts2.add("Part_4");
		PartDetails partDetail1= new PartDetails(1001, parts1);
		PartDetails partDetail2= new PartDetails(1002, parts2);
		
		partDetailss.add(partDetail1);
		partDetailss.add(partDetail2);
		
		Stream<String> flatMapStream = partDetailss.stream().flatMap(partDetails->partDetails.getParts().stream());
		flatMapStream.forEach(System.out::println);
	}

}

