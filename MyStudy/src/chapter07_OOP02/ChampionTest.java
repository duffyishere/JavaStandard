package chapter07_OOP02;

abstract class Champion{
	int x;
	int y;
	
	abstract void move(int x, int y);
	void stop() {
		System.out.println("Stoped");
	}
}

class Rel extends Champion{
	void move(int x, int y){
		System.out.printf("Rel Moved [x:%d, y:%d]%n", x, y);
	}
	
}

class Ashe extends Champion{
	void move(int x, int y){
		System.out.printf("Ashe Moved [x:%d, y:%d]%n", x, y);
	}
	
}

public class ChampionTest {
	public static void main(String[] args) {
		Champion[] group = {new Rel(), new Ashe()};
		
		for(int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}
	}
}
