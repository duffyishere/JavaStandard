package chapter13_Thread;

class ThreadEx03 implements Runnable{
	  @Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<=500; i++) {
			System.out.print("#");
		}
		System.out.println("---------------- Time# : "+ System.currentTimeMillis()+"---------------- ");
	}
}

class ThreadEx04 implements Runnable{
	  @Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<=500; i++) {
			System.out.print("*");
		}
		System.out.println("---------------- Time* : "+ System.currentTimeMillis()+"---------------- ");
	}
}

public class ThreadTest02 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadEx03());
		Thread t2 = new Thread(new ThreadEx04());
		
		t1.start();
		t2.start();
		
	}
}
