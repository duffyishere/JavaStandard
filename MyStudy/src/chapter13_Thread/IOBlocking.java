package chapter13_Thread;

import java.util.Scanner;

class Counting implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 		}
	}
}

class Input implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Input number : ");
		sc.nextLine();

	}
}
public class IOBlocking {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Counting());
		Thread t2 = new Thread(new Input());

		t1.start();
		t2.start();
		
	}
}
