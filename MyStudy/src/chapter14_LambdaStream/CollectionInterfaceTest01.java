package chapter14_LambdaStream;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionInterfaceTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=1; i<11; i++) {
			list.add(i);
		}
		
		map.put("First",1);
		map.put("Second",2);
		map.put("Third ",3);
		
		list.forEach(i -> System.out.print(i+", "));
		System.out.println();
		
		list.removeIf(i -> i%2==0 ||  i%5==0);
		list.forEach(i -> System.out.print(i+", "));
		System.out.println();
		
		list.replaceAll( i -> i*10 );
		list.forEach(i -> System.out.print(i+", "));
		System.out.println();

		map.forEach((k, v) -> System.out.println("{"+k+":"+v+"}"));
	}
}
