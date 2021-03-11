package chapter09_UtilClasses;

public class EqualsTest01 {
	public static void main(String[] args) {
		Value01 v1 = new Value01(10);
		Value01 v2 = new Value01(100);
		
		if(v1.equals(v2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Difference");
		}
	}
}

class Value01{
	final int value;
	
	Value01() {
		value = 10;
	}
	
	Value01(int value){
		this.value = value;
	}
	
	public boolean equals(Object obj) {		
		if(!(obj instanceof Value01)) return false;
		
		return this.value == ((Value01)obj).value;
	}	
}