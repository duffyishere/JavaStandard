package chapter12_01_GenericsEnumAnnotation;

import java.util.*;

class Products{
	
}
class Computer extends Products{
	public String toString() {
		return "Computer";
	}
}
class Audio extends Products{
	public String toString() {
		return "Audio";
	}
}

public class GenericsTest02 {
	public static void main(String[] args) {
		ArrayList<Products> pArr = new ArrayList<Products>();
		
		pArr.add(new Audio());
		pArr.add(new Computer());
		
		printAll(pArr);
	}
	
	public static void printAll(ArrayList<Products> pArr) {
		Iterator<Products> it = pArr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
