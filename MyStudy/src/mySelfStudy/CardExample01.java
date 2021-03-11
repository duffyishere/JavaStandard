package mySelfStudy;

import java.util.ArrayList;

class Cards{
	static final int MAX_KIND = 4;
	static final int MAX_NUMBER = 13;
	static final int Spade = 1;
	static final int Heart = 2;
	static final int Diamond = 3;
	static final int Clover = 4;
	int kind;
	int number;
	
	Cards(){
		kind = Spade;
		number = 1;
	}
	
	Cards(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kindList = {"","Spade", "Heart", "Diamond", "Clover"};
		String[] numberList = {"","1","2","3","4","5","6","7","8","9","10","Queen","King","Joker"};

		return kindList[this.kind]+" "+numberList[this.number];
	}
}

class MyCard{
	static ArrayList<Cards>  cardList = new ArrayList<Cards>();
	 
}

class Deck{
	final int CARD_NUM = 52;
	Cards[] card = new Cards[CARD_NUM];
	MyCard cList = new MyCard();
		Deck() {
		int arr=0;
		
		for(int i=1; i<=Cards.MAX_KIND; i++) {
			for(int j=1; j<=Cards.MAX_NUMBER; j++) {
				card[arr++] = new Cards(i, j);
			}
		}
	}
	public void draw(int index) {
		cList.cardList.add(card[index]);
	}
	public void draw() {
		cList.cardList.add(card[(int) (Math.random()*52)]);
	}
}

public class CardExample01 {
	public static void main(String[] args) {
		Deck d = new Deck();
		d.draw();
		d.draw();
		
		System.out.println(MyCard.cardList);
	}
}
