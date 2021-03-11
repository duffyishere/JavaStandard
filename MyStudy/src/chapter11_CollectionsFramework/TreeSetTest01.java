package chapter11_CollectionsFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest01 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		for(int i=0; i<6; i++) {
			ts.add(new Integer((int)	(Math.random()*45)+1));
		}
		System.out.println(ts);
	}
}
