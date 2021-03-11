package chapter14_LambdaStream;

import java.util.Random;
import java.util.stream.IntStream;

public class IntermediateTest01 {
	public static void main(String[] args) {
		IntStream intStream = new Random().ints(0, 11);
		intStream.limit(10).distinct().forEach(System.out::println);
	}
}
