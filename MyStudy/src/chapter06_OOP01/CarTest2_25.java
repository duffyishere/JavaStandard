package chapter06_OOP01;

class Car2{
	String color;
	String geartype;
	int door;
	
	Car2(){
		this("red", "auto", 4);
	}
	
	Car2(String color) {
		this(color, "auto", 4);
	}

	Car2(String c, String g, int d){
		this.color = c;
		this.geartype = g;
		this.door = d;
	}
}

public class CarTest2_25 {
	public static void main(String[] args) {
		Car2 c = new Car2();
		Car2 c2 = new Car2("red");
		
		System.out.println(c.color);
		System.out.println(c.geartype);
		System.out.println(c.door);
		
		System.out.println(c2.color);
		System.out.println(c2.geartype);
		System.out.println(c2.door);
	}
}
