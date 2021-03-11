package chapter11_CollectionsFramework;

import java.util.*;
import java.util.Map.Entry;

public class HashMapTest02 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put("Math", 100);
		hm.put("English", 90);
		hm.put("P.E", 100);
		
		Set hs = new HashSet(hm.entrySet());
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Entry)it.next();
			System.out.println("과목:"+e.getKey()+", 점수:"+e.getValue()+"점");
		}
		
		Collection c = hm.values();
		Iterator itC = c.iterator();
		
		int add = 0;
		
		while(itC.hasNext()) {
			add += (int)itC.next();
		}
		System.out.println("합계:"+add+"점");
		System.out.println("평균:"+Math.round((float)add/c.size())+"점");
		System.out.println("최대 값:"+Collections.max(c)+"점");
		System.out.println("최소 값:"+Collections.min(c)+"점");
		

	}
}
