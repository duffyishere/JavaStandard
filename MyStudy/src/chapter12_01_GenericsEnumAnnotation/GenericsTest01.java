package chapter12_01_GenericsEnumAnnotation;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Integer(30));
//		list.add("40");

//		Integer i = (Integer)list.get(0);
		Integer i = list.get(0);
		 		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			Object list2  = it.next();
		}
		
 	}
} 
