package chapter07_OOP02;

public class DrawShape02 {
	public static void main(String[] args) {
		Circle c = new Circle(new Point(100,100));
		
		c.draw();
	}
}

class Shape{
	String color = "black";
	void draw() {
		System.out.printf("[color = %s]", color);
	}
}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){
		this(0, 0);
	}
	
	String getXY() {
		return "("+x+","+y+")";
	}
}

class Circle extends Shape{
	Point center;
	int r;
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	Circle(Point center){
		this.center = center;
		this.r = 50;
	}
	
	Circle(){
		this(new Point(0,0), 100);
	}
	
	void draw() {
		System.out.printf("[center = (%d, %d)], r = %d, color = %s]\n", center.x, center.y, r, color);
	}
}

//class Triangle extends Shape{
//	Point[] p = new Point[3];
//	
//	Triangle(Point[] p) {
//		this.p = p;
//	}
//	
//	void draw() {
//		System.out.printf("[p1 = %s, %p2 = %s, p3 = %s, color = %s]\n",p[0]);
//	}
//}