package chapter14_LambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

class MyClass{
	int num;
	
	MyClass(){}
	
	MyClass(int num) {
		this.num = num;
	}
//	public String toString() {
//		return "MyClass";
//	}
}
public class MethodReferenceTest02 {
	public static void main(String[] args) {
//		Supplier<MyClass> s = () -> new MyClass(); 
		Supplier<MyClass> s = MyClass::new;
		 
//		Function<Integer, MyClass> f = (i) -> new MyClass(i);
		Function<Integer, MyClass> f  = MyClass::new;
		
// 		Function<Integer, int[]> f2 = (i) -> new int[i];
		Function<Integer, int[]> f2 = int[]::new;

		System.out.println(s.get());
		System.out.println(f.apply(20).num );
		System.out.println(f2.apply(10).length);

	}
}
