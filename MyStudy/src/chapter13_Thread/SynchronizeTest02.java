package chapter13_Thread;

import java.util.ArrayList;

class Table{
	String[] dishesList = {"Donut", "Burger", "Donut"};
	final int MAX_FOOD = 6;
	
	ArrayList<String> dishes = new ArrayList<String>();
	
	public int getDishesSize() {return dishesList.length;}
	
	public synchronized void add(String dish) {
		String name = Thread.currentThread().getName();
		while(dishes.size() >= MAX_FOOD) {
			System.out.println(name+" is waiting...(Dishes are full)");
			try {
				wait();
				Thread.sleep(250);
				} catch (InterruptedException e) {}
			}
		dishes.add(dish);
		notifyAll();
		System.out.println(name+" served "+dish);
		System.out.println(dishes+"\n");
	}
	
	public synchronized void remove(String dish) {	//no food, no Desired food
		String name = Thread.currentThread().getName();
		while(dishes.size() == 0) {
			System.out.println(name + " is waiting...(no more dishes)\n");
			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		while(true) {
			for(int i=0; i<dishes.size(); i++) {
				if(dish.equals(dishes.get(i))) {
					System.out.println(name + " is eat "+dish);
					dishes.remove(i);
					notifyAll();
					return;
				}				
			}
			try {
				System.out.println(name + " is waiting...\n");
				wait();
				Thread.sleep(500);
				
			} catch (InterruptedException e) {}
		}
	}
}

class Chef implements Runnable{
	private Table table;
	
	Chef(Table table){
		this.table = table;
	}
	
	@Override
	public void run() {
		while(true) {
			int index = (int) (Math.random()*table.getDishesSize());
			String dish = table.dishesList[index];
			table.add(dish);
		}
	}
}

class Customer implements Runnable{
	private String dish;
	private Table table;
	
	Customer(String dish, Table table){
		this.dish = dish;
		this.table = table;
	}
	
	@Override
	public void run() {
		while(true) {
			table.remove(dish);
		}
	}
}

public class SynchronizeTest02{
	public static void main(String[] args) throws Exception{
		Table table = new Table();
		
		new Thread(new Chef(table), "Chef").start();
		new Thread(new Customer("Donut", table),"Customer1").start();
		new Thread(new Customer("Burger", table), "Customer2").start();
		
		Thread.sleep(1000);
		System.exit(0);
	}
}
