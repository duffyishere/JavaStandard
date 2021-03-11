package chapter14_LambdaStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionTest01 {
	public static void main(String[] args) {
		Supplier<Integer> s = () -> new Integer((int) (Math.random()*45+1));
		Consumer<Integer> c = i -> System.out.print(i+", ");
		Predicate<Integer> p = i -> i%2==0;
		Function<Integer, Integer> f = i -> i/10*10;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		makeRandomList(s, list);
		System.out.println(list);
		
		printEvenNum(c, p, list);
		
		System.out.println(doSomething(f, list) );
	}
	static <E> void makeRandomList(Supplier<E> num, List<E> list) {
		for(int i=0; i<10; i++) {
			list.add(num.get());
		} 
	}
	
	static <E> void printEvenNum(Consumer<E> c, Predicate<E> p, List<E> list) {
		System.out.print("[");
		for(E i : list) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
		System.out.println("]");
	}
	
	static <E> List<E> doSomething(Function<E, E> f, List<E> list){
		ArrayList<E> newList = new ArrayList<E>();
		for(E i : list) {
			newList.add(f.apply(i));
		}
		return newList;
	}
}
