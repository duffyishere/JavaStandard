package chapter13_Thread;

class MyThread implements Runnable{
	volatile boolean stoped = false;
	volatile boolean suspend = false;
	Thread t;
	
	MyThread() {
		t = new Thread(this, "MyThread");
	}
	MyThread(String name){
		t = new Thread(this, name);
	}
	
	@Override
	public void run() {
		while(!stoped) {
			if(!suspend) {
				System.out.println(Thread.currentThread().getName());
				delay(1);
			}
			else {
				Thread.yield();
			}
		}
	}
	
	void delay(int sec) {
		try {
			Thread.sleep((long) sec*1000);
		} catch (InterruptedException e) {
			
		}
	}
	
	void start()	{t.start();}
	void stop()		{stoped = true;}
	void resume() 	{suspend = false; t.interrupt();}
	void suspend() 	{suspend = true; t.interrupt(); }

}

public class SuspendTest01 {
	public static void main(String[] args) {

		MyThread t1 = new MyThread("*");
		MyThread t2 = new MyThread("#");
		
		t1.start();
		t2.start();
		
		t1.delay(2);
		t1.suspend();
		
		t2.delay(2);
		t2.suspend();
		
		t1.delay(2);
		t1.resume();

		t1.delay(2);
		t2.resume();
		
		t1.delay(2);
		t1.stop();
		
		t1.delay(2);
		t2.stop();
	}
}
