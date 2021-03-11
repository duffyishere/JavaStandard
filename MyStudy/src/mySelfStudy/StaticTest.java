package mySelfStudy;

class Add{
	public static int add(int x, int y) {
		return x+y;
	}
}

public class StaticTest {
	public static void main(String[] args) {
		System.out.println(Add.add(1, 10));
	}
}
