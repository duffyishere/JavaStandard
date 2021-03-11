package chapter11_CollectionsFramework;

import java.util.Arrays;
import java.util.Comparator;

class Descending implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			
			return c2.compareTo(c1);
		} 
		return -1;
	}
	
}

public class SortTest01 {
	public static void main(String[] args) {
		String[] arrs = {"cats", "Dogs", "tigers", "lions"};
		
		Arrays.sort(arrs);
		System.out.println(Arrays.toString(arrs));
		
		Arrays.sort(arrs, String.CASE_INSENSITIVE_ORDER);	//String class에서 Comparator interface를 구현한 대문자 무시 static 메서드 호출. 
		System.out.println(Arrays.toString(arrs));
		
		Arrays.sort(arrs, new Descending());
		System.out.println(Arrays.toString(arrs));
	}
}	
