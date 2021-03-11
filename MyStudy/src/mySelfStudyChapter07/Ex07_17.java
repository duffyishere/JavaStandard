package mySelfStudyChapter07;

class Unit{
	int x,y;

	public void move(int x, int y) {System.out.println("move");}
	public void stop() {}
}

class Marine extends Unit{
	void steampack() {};
}

class Tank extends Unit{
	void changemode() {}
}

class DropShip extends Unit{

}

public class Ex07_17 {
	public static void main(String[] args) {

	}
}
