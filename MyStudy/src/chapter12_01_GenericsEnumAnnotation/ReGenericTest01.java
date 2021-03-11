package chapter12_01_GenericsEnumAnnotation;

import java.util.ArrayList; 

public class ReGenericTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
//		list.add("30");
		
		System.out.println(list);
	}
}
