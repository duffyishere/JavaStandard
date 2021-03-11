package mySelfStudy;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LottoNumberEx01 {
	static int flag=0;
	public static void main(String[] args) {
		IntStream number = new Random().ints(6, 1, 46);
		Stream<String> stringStream = number.distinct().sorted().mapToObj(i -> i+", ");
		stringStream.forEach(System.out::print);
	}
	
//	String toString(int i) {
//		flag++;
//		return i+", ";
//	}
}
