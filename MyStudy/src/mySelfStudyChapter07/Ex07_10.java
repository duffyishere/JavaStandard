package mySelfStudyChapter07;

class MyTv{
	private boolean isPower;
	private int prevChannel;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100; 
	final int MIN_VOLUME = 0; 
	final int MAX_CHANNEL = 100; 
	final int MIN_CHANNEL = 1;
	
	
	public void setChannel(int channel) {
		this.prevChannel = this.channel;
		this.channel = channel;
	}
	public void gotoPrevChannel() {
		int temp = this.channel;
		this.channel = prevChannel;
		prevChannel = temp;
	}

	public void setVolume(int volume) {this.volume = volume;}
	public int getChannel() {return channel;}
	public int getVolume() {return volume;} 
	
	
	
	public MyTv(boolean isPower, int channe, int volume) {
		this.isPower = isPower;
		this.channel = channe;
		this.volume = volume;
	}
}

public class Ex07_10 {
	public static void main(String[] args) {
		MyTv t = new MyTv(false, 0, 0);
		
		t.setChannel(10); 
		System.out.println("CH:"+t.getChannel()); 
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel()); 
		t.gotoPrevChannel(); 
		System.out.println("CH:"+t.getChannel()); 
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
