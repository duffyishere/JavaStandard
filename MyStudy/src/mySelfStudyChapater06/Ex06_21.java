package mySelfStudyChapater06;

class MyTv{
	boolean isPower;
	int channel; 
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0; 
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {isPower =! isPower;}
	void volumeUp() {volume = (volume < MAX_VOLUME)? ++volume:volume;}
	void volumeDown() {volume = (volume > MIN_VOLUME)? --volume:volume;}
	void channelUp() {channel = (channel == MAX_CHANNEL)? MIN_CHANNEL : ++channel;}
	void channelDown() {channel = (channel == MIN_CHANNEL)? MAX_CHANNEL : --channel;}
}
public class Ex06_21 {
	public static void main(String[] args) {
		MyTv t = new MyTv();

		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
	
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);

	}
}
