package chapter11_CollectionsFramework;

import java.util.*;

class History{
	static Queue q = new LinkedList();

	static void terminal() {
		System.out.println("Input command.");
		while(true) {
			System.out.print(">");
			
			Scanner sc = new Scanner(System.in);
			String command = sc.nextLine().trim();
			
			if(command.equals("") && command == null) continue;
			
			q.offer(command);
			final int SIZE = 5;

			if(q.size() > SIZE) {
				q.remove();
			}
			
			if(command.equalsIgnoreCase("help")) {
				
			}
			else if(command.equalsIgnoreCase("history")) {
				LinkedList list = (LinkedList) q;
				for(int i=0; i<SIZE; i++) {
					System.out.println(i+1+"."+list.get(i));
				}
			}
		}
	}
}

public class HistoryTest01 {
	public static void main(String[] args) {
		new History().terminal();
	}
}
 