package chapter06_OOP01;

public class ReferenceParamEx02_11 {
	public static void main(String[] args) {
		int[] x = {10};
		System.out.println("현제 x의 값 = " + x[0]);
		
		change(x);
		
		System.out.println("chage() 실행 후 x의 값 = " + x[0]);
		}
	
	static void change(int[] x) {
		x[0] = 10000;
		System.out.println("chage() x의 값 = " + x[0]);
	}
}