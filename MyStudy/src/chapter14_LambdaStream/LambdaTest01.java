package chapter14_LambdaStream;

@FunctionalInterface
interface MyFunction{
	int max(int num1, int num2);  
}

abstract class MyFunction01{
	abstract int max(int num1, int num2);
}

public class LambdaTest01 {
	public static void main(String[] args) {
		MyFunction myfunc = (a, b) -> a>b?a:b;
		  
		System.out.println(myfunc  .max(1, 0));
	}
}
