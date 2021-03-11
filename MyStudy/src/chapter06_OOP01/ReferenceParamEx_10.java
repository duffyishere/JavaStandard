package chapter06_OOP01;

public class ReferenceParamEx_10 {
	public static void main(String[] args) {
		Data10 data;  //data메모리 생성
		data = new Data10();   //data메모리에 Date10클래스 인스턴스 생성
		
		System.out.printf("현제 x의 값 = %d%n", data.x);
		
		
		System.out.println("chage() 실행 후 x의 값 = " + data.x);
		
		change(data);
		}
	
	static void change(Data10 data) {
		data.x = 10000;
		System.out.println("chage() x의 값 = " + data.x);
	}
}

class Data10 {
	int x = 10;
}
