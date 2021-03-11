package mySelfStudyChapater06;

class MyPoint{
	int x;
	int y;
	
	MyPoint(){
		x = 1;
		y = 1;
	}
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x, int y) {
		return Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
	}
}
public class Ex06_06 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint();
		
		System.out.println(p.getDistance(2, 2));
	}

}
