package chapter07_OOP02;

public class PontTest3_08 {
	public static void main(String[] args) {
		Point3D p = new Point3D(100, 200, 300);
		
		System.out.println(p.getLocation());
	}
}

class Point03{
	int x =20;
	int y = 10;
	
//	Point03(){}
	
	Point03(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point03{
	int z = 30;
	
//	Point3D(){}
	
	Point3D(int x, int y, int z){
		super(x, y);
//		this.x = x;
//		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : " +x+ " y : " +y +" z : "+z;
	}
}

