package mySelfStudy;

import java.util.*;

class Fruit{}
class Apple extends Fruit{}
class Orange extends Fruit{}
class Toy{}

class Boxes<E extends Fruit>{
	ArrayList<E> list = new ArrayList<E>();
	
	void add(E object) {list.add(object);}
	void printAll() {System.out.println(list);}
}

public class FruitBoxExample01 {
	public static void main(String[] args) {
		Boxes<Fruit> box1 = new Boxes<Fruit>();
		Boxes<Apple> box2 = new Boxes<Apple>();
//		Boxes<Toy> box3 = new Boxes<Toy>();
		
		box1.add(new Apple());
		box1.add(new Orange());
//		box1.add(new Toy());
		
		box2.add(new Apple());
//		box2.add(new Orange());

		box1.printAll();
		box2.printAll();
//		System.out.println(box3);	
	}
}
