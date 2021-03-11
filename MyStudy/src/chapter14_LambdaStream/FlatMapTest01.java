package chapter14_LambdaStream;

import java.util.stream.Stream;

public class FlatMapTest01 {
	public static void main(String[] args) {
		String[] lineArr = {
				"Slow and Steady win the race",
				"No sweat no sweet"
			 };
		
		Stream<String> strArr = Stream.of(lineArr); 
		strArr.flatMap(i -> Stream.of(i.split(" +")))
		.distinct()
		.sorted()
		.map(String::toLowerCase)
		.forEach(System.out::println);
	}
}
