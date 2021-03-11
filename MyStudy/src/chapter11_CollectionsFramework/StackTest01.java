package chapter11_CollectionsFramework;

import java.util.*;

public class StackTest01 {
	private static Stack back = new Stack();
	private static Stack previous = new Stack();
	
	public static void main(String[] args) {
		goURL("www.naver.com");
		goURL("www.google.com");
		printStatus();
		
		goBack();
		printStatus();
		
		goPrevious();
		printStatus();
	}
	public static void goURL(String url) {
		back.add(url);
	}
	
	public static void goBack() {
		if(!back.empty()) {
			previous.add(back.pop());
		}
	}
	public static void goPrevious() {
		if(!back.empty()) {
			back.add(previous.pop());
		}
	}
	public static void printStatus() {
		System.out.println("-------------------------");
		System.out.println("이전 페이지 : "+back);
		System.out.println("다음 페이지 : "+previous);
		System.out.println("현제 페이지 : "+back.peek()+"\n");
	}
}
