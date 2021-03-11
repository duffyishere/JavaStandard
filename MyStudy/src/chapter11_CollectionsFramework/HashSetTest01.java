package chapter11_CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {
	public static void main(String[] args) {
		int[] list = {1,2,2,3,3,4,5};
		
		HashSet hs = new HashSet();
		
		for(int i=0; i<list.length; i++) {
			hs.add(new Integer(list[i]));
		}
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}

