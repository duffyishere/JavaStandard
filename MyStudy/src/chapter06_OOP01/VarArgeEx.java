package chapter06_OOP01;

public class VarArgeEx {
	public static void main(String[] args) {
		System.out.println(concantenate(" ", "100", "200", "300"));
		System.out.println(concantenate("-", "100", "200", "300"));
		System.out.println(concantenate("+", "100", "200", "300"));
		System.out.println(concantenate("+", "100", "200", "300"));
	}
	
	static String concantenate(String delium, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str + delium;
		}
		
		return result;
	}
//	static String concantenate(String...args) {
//		return concantenate("", args);
//}
}
