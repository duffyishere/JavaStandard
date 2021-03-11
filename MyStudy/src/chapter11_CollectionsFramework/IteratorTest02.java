package chapter11_CollectionsFramework;

import java.util.*;

public class IteratorTest02 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
        map.put("키1", "값1");
        map.put("키2", "값2");
        map.put("키3", "값3");
        map.put("키4", "값4");
        map.put("키5", "값5");
        map.put("키6", "값6");

		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
