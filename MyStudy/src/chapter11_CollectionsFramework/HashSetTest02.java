package chapter11_CollectionsFramework;

import java.util.*;

public class HashSetTest02 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		for(int i=hs.size(); i<6; i++) {
			hs.add(new Integer((int) ((Math.random()*45)+1)));
		}
		
		ArrayList list = new ArrayList(hs);
		
		Collections.sort(list);
		System.out.println(list);
	}
}	
