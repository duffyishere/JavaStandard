package chapter12_01_GenericsEnumAnnotation;

import java.util.*;

class Fruit{}
class FreshFruit extends Fruit{}
class RottenFruit extends Fruit{}
class FreshApple extends FreshFruit{ public String toString() {return "Fresh apple!!";}}
class RottenApple extends RottenFruit{ public String toString() {return "Rotten apple!!";}}
class Toy{public String toString() {return " Toy!!";}}

class Basket<E>{
	ArrayList<E> list = new ArrayList<E>();
	
	void add(E obj) {list.add(obj);}
	void printAll() {System.out.println(list);}
}
class FruitBasket<E extends Fruit> extends Basket{};
class FreshFruitBasket<E extends FreshFruit> extends Basket<E>{}
class RottenFruitBasket<E extends RottenFruit> extends Basket<E>{}


public class GenericsTest03 {
	public static void main(String[] args) {
		Basket basket = new Basket(); 
		FruitBasket<? extends Fruit> fruitBasket = new FruitBasket<Fruit>();
		FreshFruitBasket<FreshApple> freshBasket = new FreshFruitBasket<FreshApple>();
		RottenFruitBasket<RottenFruit> rottenBasket = new RottenFruitBasket<RottenFruit>();
		
		basket.add(new FreshApple());
		basket.add(new RottenApple());
		basket.add(new Toy());
		basket.printAll();
		
		fruitBasket.add(new FreshApple());
		fruitBasket.add(new RottenApple());
//		fruitBasket.ad d(new Toy());
		fruitBasket.printAll();
		
		freshBasket.add(new FreshApple());
//		freshBasket.add(new RottenApple());
//		freshBasket.add(new Toy());
		freshBasket.printAll();
		
//		rottenBasket.add(new FreshApple());
		rottenBasket.add(new RottenApple());
//		rottenBasket.add(new Toy());
		rottenBasket.printAll();
	}
}
	
