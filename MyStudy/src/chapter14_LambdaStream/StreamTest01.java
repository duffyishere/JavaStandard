package chapter14_LambdaStream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest01 {
	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<Integer>(getRandom());
//		Stream<Integer> stream = set.stream();
//		
//		stream.forEach((i) -> System.out.printf(i+", "));
		
		for(int i=1; i<7; i++) {
			System.out.printf(i+"번째 로또번호 : ");
			new HashSet<Integer>(getRandom()).stream().forEach((j) -> System.out.printf(j+", "));
			
			IntStream intStream = new Random().ints(1,46);
			intStream.limit(6).forEach(j -> System.out.print(j+", "));
			
			System.out.println();
		}
	}
	
	public static Set getRandom() {
		HashSet<Integer> random = new HashSet<Integer>();
		while(random.size()<6) {
			random.add((int) (Math.random()*45+1));
		}
		return random;
	}
}
 