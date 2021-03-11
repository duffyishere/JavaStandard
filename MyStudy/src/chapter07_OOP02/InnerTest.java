package chapter07_OOP02;

import chapter07_OOP02.AAA.Bclass;
import chapter07_OOP02.AAA.Cclass;

class AAA{
	int a = 100;
	
	static class Bclass{
		static int b = 1000;
 
	}
	class Cclass{
		final static int c = 2000;
	}
	
}

public class InnerTest {
	public static void main(String[] args) {
		AAA a = new AAA();
		
		a.a = 200;
		
		System.out.println(Bclass.b);
		System.out.println(Cclass.c);
	}
}

