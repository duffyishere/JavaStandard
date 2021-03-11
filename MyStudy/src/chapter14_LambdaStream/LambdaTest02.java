package chapter14_LambdaStream;

@FunctionalInterface
interface MyFunction02{
	void run();
}

public class LambdaTest02 {
	static void execute(MyFunction02 f) {
		f.run();;
	}
	static MyFunction02 getMethod() {
		return ()->System.out.println("Run!!");
	}
	public static void main(String[] args) {
		MyFunction02 f1 = () -> System.out.println("Run!!");
		MyFunction02 f2 = getMethod();
		
		f1.run();
		f2.run();
		execute(f2);
		execute(() -> System.out.println("Run!!") );
	}
	
}
