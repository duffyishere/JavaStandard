package chapter06_OOP01;

class Data09 {
	int x = 10;
}

public class PrimitiveParamEx_09 {
	public static void main(String[] args) {
		Data09 data = new Data09();
		
		System.out.printf("현제 x의 값 = %d%n", data.x);
		
		int changeData = change(data.x);
		
		System.out.println("chage() 실행 후 x의 값 = " + data.x);
		System.out.println("chageData 값 = " + changeData);
	}
	
	static int change(int x) {
		x = 10000;
		System.out.println("chage() x의 값 = " + x);
		return x;
	}
}
