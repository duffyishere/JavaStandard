package chapter08_ExceptionHandling;

public class ExceptionEx01 {
	public static void main(String[] args) {
		try {
			throw new Exception("Create new Fake Exception");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("TEST");
	}
}
