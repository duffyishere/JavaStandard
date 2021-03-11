package chapter06_OOP01;

public class ReturnTest_13 {

	public static void main(String[] args) {
		
		int add_result = add(3, 3);
		System.out.println(add_result);
		
		int[] arr = {10};
		add2(3, 3, arr);
		System.out.println(arr);	
	}
	
	
	static int add(int a, int b) {
		return a+b;
	}
	
	
	static void add2(int a, int b, int[] arr) {
		arr[0] = a+b; 
	}
}
