package chapter13_Thread;
import javax.swing.JOptionPane;

class Thread01 extends Thread implements Runnable{
	@Override
	public void run() {
		int i =10;
//		System.out.println(isInterrupted());
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			delay(1);
		}
		System.out.println("Countdown is End");
	} 
	
	public void delay(int sec) {
		try {
			Thread.sleep((long) sec*1000);
		} catch (InterruptedException e) {
			super.interrupt();
//			System.out.println(isInterrupted());
		}
	}
}

public class InterruptTest01{
	public static void main(String[] args) {
		Thread t = new Thread(new Thread01());
		
		t.start();
		System.out.println("isInterrupted :"+t.isInterrupted());
		
		String input = JOptionPane.showInputDialog("Input number.");
		System.out.println(input);
		t.interrupt();
	}
}
