package chapter14_LambdaStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IterateTest01 {
	public static void main(String[] args) {
		Stream<Integer> evenNum =  Stream.iterate(2, i->i+2);
		evenNum.limit(10).forEach(System.out::println);
		
		Stream<Double> randomNum = Stream.generate(Math::random);
		randomNum.limit(10).forEach(System.out::println);
	}
}
