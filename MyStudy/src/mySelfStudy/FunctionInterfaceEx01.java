package mySelfStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaceEx01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Supplier<Integer> s = () -> new Integer((int) (Math.random()*45+1));
		Consumer<Integer> c = (i) -> System.out.print(i+", ");
		Predicate<Integer> p = (i) -> i%2==0;
		Function<Integer, Integer> f = (i) -> i/10*10;
 		
		System.out.println(makeRandmList(s, list));
		checkList(p, c, list);
		System.out.println(roundDown(f, list));
	}
	
	static<E> List makeRandmList(Supplier<E> s, List<E> list){
		for(int i=0; i<16; i++) {
			list.add(s.get());
		}
		return list;
	}
	
	static <E> void checkList(Predicate<E> p, Consumer<E> c, List<E> list ){
		System.out.print("[");
		for(E i : list) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
		System.out.println("]");
	}
	
	static <E> List roundDown(Function<E, E> f, List<E> list) {
		ArrayList<E> newList = new ArrayList<E>();
		for(int i=0; i<list.size(); i++) {
			newList.add(f.apply(list.get(i)));
		}
		return newList;
	}
}
