package mySelfStudy;

class Car{
	int door = 4;
	String color;
}

class FireEngine extends Car{
	public void Siren(){
		System.out.println("!~!!~~!");
	}
}


public class Curious01 {
	public static void main(String[] args) {
		try {
			Car c = new Car();
			FireEngine fe = new FireEngine();
			
//			Car c2 = new FireEngine();	//가능
//			FireEngine fe = new Car();	//불가
			
			c = (Car)fe;
			FireEngine fe2 = (FireEngine)c;
			
			fe2.Siren();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
