package chapter07_OOP02;

class Tv{
	boolean power;
	int channel;
	
	void power() {
		power =! power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}

class CaptionTv extends Tv{
	boolean caption;
	
	void caption() {
		caption =! caption;
	}
	void displayCaption(String text) {
		if(caption) System.out.println(text);
	}
}

public class CaptionTvTest01 {
	public static void main(String[] args) {
		CaptionTv c = new CaptionTv();
		
		c.channel = 11;
		System.out.println("채널 번호 : "+c.channel);
		
		c.displayCaption("Helloworld");
		
		c.caption();
		c.displayCaption("Helloworld");
	}
}
