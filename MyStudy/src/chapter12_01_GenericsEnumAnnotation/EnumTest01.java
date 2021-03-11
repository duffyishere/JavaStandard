package chapter12_01_GenericsEnumAnnotation;

enum Directions{
	East(90), South(180), West(270), North(0);
	
	private static Directions[] dList = Directions.values();
	private int value;
	Directions(int value){
		this.value = value;
	}
	
	public static Directions of(int dir) {
		if(dir>4 || 0>dir) {
			throw new IllegalArgumentException("Invailed value : "+dir);
		}
		return dList[dir];
		}
	public int getValue() {return value;}
	public Directions spin(int repeat) {
		repeat = repeat%4;
		if(repeat<0) repeat = repeat+4;
		return dList[(value+repeat)%90];
	}
}

public class EnumTest01 {
	public static void main(String[] args) {
		Directions d1 = Directions.East;
		Directions d2 = Directions.South;
		Directions d3 = Directions.of(2);
		
		System.out.println(d1);
		System.out.println(d3);
		System.out.println("------------");
		for(Directions d : Directions.values()) {
			System.out.println(d);
		}
		System.out.println("------------");

		System.out.println((Directions.valueOf("East")==d1 ? "True":"False"));
		System.out.println("------------");

		System.out.println(d1.getValue());
		System.out.println("------------");

		System.out.println(d1.spin(-2));
	}
}

