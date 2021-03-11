package chapter07_OOP02;

import java.util.Scanner;

class Outer{
	private int iv = 100;
	static int cv = 200;
	
	class InstanceInner{
		int insInner = iv;  //InnerClass can use Private valuable
		int insInner2 = cv;
	}
	
	static class StaticInner{
//		int staInner = iv;  //StaticClass can not use Instance valuable
		static int staInner2 = cv;
	}
	
	void myMethod() {
		int lv = 10;
		final int LV = 20;
		lv = 30;
		
		class LocalInner{
			int locInner = iv;
			int locInner2 = cv;
			 
//			int locInner3 = lv;  //Error! Use only constant
			int locInner4 = LV;   
		}
		
	}
	
}

public class OuterTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}
}
