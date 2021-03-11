package chapter13_Thread;

class Account{
	private int balance=1000;
	
	public int getBalance() {return balance;}
	
	public synchronized void withdraw(int money){
		if(balance >= money) {
			try {
				Thread.sleep(1000);
				balance -= money;
//				System.out.println("Balance :"+getBalance());
			} catch (InterruptedException e) {}
		}
		else {
//			System.out.println("Not enough money...");
		}
	}
}

class ThreadEx05 implements Runnable{	
	@Override
	public void run() {
		Account a = new Account();
		while(a.getBalance() > 0) {
			int money = (int) (Math.random()*3+1)*100;
			a.withdraw(money);
			System.out.println("Balance :"+a.getBalance());
		}
	}
}

public class SynchronizeTest01 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadEx05());
		
		t1.start();
	}
}
