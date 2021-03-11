package chapter11_CollectionsFramework;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add("2");
		
		System.out.println(list);
		
		list.remove(new Integer(1));
		list.remove("2"); 
		
		System.out.println(list);
		
	}
}
