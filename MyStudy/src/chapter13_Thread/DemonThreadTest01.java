package chapter13_Thread;

public class DemonThreadTest01 implements Runnable{
	static boolean autoSave;
	public static void main(String[] args) {
		Thread saveThread = new Thread(new DemonThreadTest01());
		saveThread.setDaemon(true);
		saveThread.start();
		for(int i=10; i>0; i-- ) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i==7) autoSave = true;
		}
		System.out.println("End the program...");
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(autoSave)
				autoSaved();
				
		}
	}
	public void autoSaved() {
		System.out.println("Saved!");
	}
}
