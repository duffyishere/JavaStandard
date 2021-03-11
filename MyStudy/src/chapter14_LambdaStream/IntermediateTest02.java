package chapter14_LambdaStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateTest02 {
	public static void main(String[] args) {
		Integer[] intArr = {1,2,3,4,5}; 
		
		Stream<Integer> intStream = Stream.of(intArr);
		Stream<String> srtStream = intStream.map( i -> String.valueOf(i));
		srtStream.forEach(i -> System.out.println(i+1));
	}
}
