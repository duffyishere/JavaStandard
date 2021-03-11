package chapter06_OOP01;

public class CarTest_24 {
	public static void main(String[] args) {
		Car c = new Car("red", "auto", 4);
		System.out.println(c.color);
		System.out.println(c.geartype);
		System.out.println(c.door);
	}
}
class Car{
	String color;
	String geartype;
	int door;
	Car() {}
	Car(String c, String g, int d){
		color = c;
		geartype = g;
		door = d;
	}
}
