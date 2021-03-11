package chapter14_LambdaStream;

class Students implements Comparable<Students>{
	String name;
	int classes;
	int score;
	
	public Students(String name, int classes, int score) {
		this.name = name;
		this.classes = classes;
		this.score = score;
	}
	
	public int getClasses() {
		return this.classes;
	}
	
	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class CompareableTest01 {
	public static void main(String[] args) {
		
	}
}
