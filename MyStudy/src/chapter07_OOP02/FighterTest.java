package chapter07_OOP02;

abstract class Unit{
	int x;
	int y;
	
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("Stoped");
	}
}

interface Fightalbe{
	public abstract void move(int x, int y);
	public abstract void attack(Fightalbe f); 
}

class Fighter extends Unit implements Fightalbe{
	public void move(int x, int y){
		System.out.printf("Moved to %d,%d%n", x, y);
	}
	
	public void attack(Fightalbe f) {
		System.out.printf("Attack %s", f);
	}
	
	public String toString() {
		return "Fighter";
	}
	
	Fightalbe getFightable() {
		return (Fightalbe)new Fighter();
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		f.move(100, 200);
		f.stop();
		f.attack(f.getFightable());
	}
}
