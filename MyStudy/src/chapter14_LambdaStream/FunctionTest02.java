package chapter14_LambdaStream;

import java.util.function.Predicate;

public class FunctionTest02 {
	public static void main(String[] args) {
//		int j = (int) (Math.random()*200+1);
		int j =100;
		
		Predicate<Integer> up = (i) -> i>100;
		Predicate<Integer> down = (i) -> i<100;
		Predicate<Integer> equal = (i) -> i==100;
		Predicate<Integer> compare = up.or(down.or(equal));
		
		String test = (compare.test(j)? j+"":"");
		System.out.println(test);
	}
}
