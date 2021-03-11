package chapter14_LambdaStream;

import java.util.function.Function;

public class MethodReferenceTest01 {
	public static void main(String[] args) {
		 Function<String, Integer> f = Integer::parseInt; 
//		 Function<String, Integer> f = i -> Integer.parseInt(i);
		 
		 System.out.println(f.apply("123")+200); 
	}
}
