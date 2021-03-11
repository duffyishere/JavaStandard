package chapter11_CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest01 {
	public static void main(String[] args) {
		Collection   c = new ArrayList();
		
		c.add(new Integer(0));
		c.add(new Integer(1));
		c.add(new Integer(2));
		c.add(new Integer(3));
		
		c.remove(new Integer(0));
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
