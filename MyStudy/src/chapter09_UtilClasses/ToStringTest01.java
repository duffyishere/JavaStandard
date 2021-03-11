package chapter09_UtilClasses;

import java.util.Objects;

class Card{
	final String kind;
	final int num;
	
	Card(){
		this("SPADE",5);
	}

	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	public int hashCode() {
		return Objects.hash(kind, num);
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card)) return false;
		
		Card c = (Card)obj;
		
		return this.kind.equals(c.kind) && this.num == c.num;
	}
	
	public String toString() {
		return"kind : "+kind+"\nnumber : "+num;
	}
}
class Card3{
	int num = 10;
}

public class ToStringTest01 {
	public static void main(String[] args) {
		Card c = new Card("Heart", 1);
		Card c2 = new Card("Heart", 1);
		Card3 c3 = new Card3();


		System.out.println(c);
		System.out.println(c2);
		
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c.equals(c3));
	}
}
