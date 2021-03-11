package chapter12_01_GenericsEnumAnnotation;

import java.util.*;

class Fruit02{}
class Apple extends Fruit02{ public String toString() {return "Apple";}}
class Orange extends Fruit02{ public String toString() {return "Orange";}}

class Boxes<E>{
	ArrayList<E> list = new ArrayList<E>();
	void add(E object) {list.add(object);}
	void getList(int index) {list.get(index);}
	void printAll() {System.out.println(list);}
	ArrayList<E> getList(){return list;}
}
class FruitBoxes<E extends Fruit02> extends Boxes<E>{}
class Jucie{ 
	String name;
	Jucie(String name){
		this.name = name+"Jucie!!";
	}
	
	public String toString() {
		return name;
	}
}

class Jucier{
	static<E extends Fruit02> Jucie juceMaker(FruitBoxes<E> fruit) {
		String tmp = "";
		for(Fruit02 f : fruit.getList())
			tmp += f+" ";
		return new Jucie(tmp);
	}
}

public class GenericsTest06 {
	public static void main(String[] args) {
		FruitBoxes<Fruit02> fruitBox = new FruitBoxes<Fruit02>();
		fruitBox.add(new Apple());
		fruitBox.add(new Orange());
		System.out.println(Jucier.juceMaker(fruitBox));
	}
}
