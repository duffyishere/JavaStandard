package chapter06_OOP01;

public class FactorialTest_15 {
	public static void main(String[] args) {
		int result = Factorial(40);
		System.out.println(result);
	}
	
	static int Factorial(int n) {
		int result = 0;
		
		if(n == 1)  return 1;
		
		else {
			result = n * Factorial(n-1);
		}
		
		return result;
	}
}
