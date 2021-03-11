package chapter07_OOP02;

abstract class Player{
	int pos;
	
	abstract void play(int pos);
	abstract void stop();
	abstract void test();
}


class AudioPlayer extends Player{
	AudioPlayer(){
		super();
	}
	
	void play(int pos) {
		System.out.println("Started with "+pos);
	}
	
 	void stop() {
		System.out.println("Stop");
	}
	
	void test() {
		System.out.println("Test");
	}
}

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player a = (Player)new AudioPlayer();
		
		a.play(100);
		a.stop();
		a.test();
	}

}
