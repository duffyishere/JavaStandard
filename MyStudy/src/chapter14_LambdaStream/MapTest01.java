package chapter14_LambdaStream;

import java.io.File;
import java.util.stream.Stream;

public class MapTest01 {
	public static void main(String[] args) {
		File[] fileArr = {new File("Ex01"), (new File("Ex01.txt")), new File("Ex01.java"), new File("Ex02.java"), new File("Test01.py")};
		
		Stream<File> fileStream = Stream.of(fileArr);
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println);
		
		System.out.println("------------");
		 
		fileStream = Stream.of(fileArr);
		fileStream.map(File::getName)
					.filter(i -> i.indexOf('.') != -1)
					.map(i -> i.substring(i.indexOf(".")+1))
					.map(String::toLowerCase)
					.distinct()
					.forEach(System.out::println);
		
 	}
}
 