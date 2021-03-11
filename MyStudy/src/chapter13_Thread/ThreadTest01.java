package chapter13_Thread;

//better than extends
 class ThreadEx01 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class ThreadEx02 extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName());
		}
	}
}

public class ThreadTest01 {
	public static void main(String[] args) { 
		Thread t1 = new Thread(new ThreadEx01() );
		Thread t2 = new ThreadEx02();
		
 		t1.start();
		t2.start();
	}
}
