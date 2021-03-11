package chapter10_Calendar;

import java.util.*;

class CalendarView{
	
	public static void getCalendar(int year, int month) {
		Calendar date = Calendar.getInstance();
		date.set(year, month, 1);
		
		final String[] monthList = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};	
		
		int firstDayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("        "+monthList[month]+"  "+year);  
		System.out.println(" SUN MON TUE WEN THU FRI SAT");
		
		if(firstDayOfWeek == 7) {
			for(int n =1; n<=firstDayOfWeek-1; n++) {
				System.out.print("    ");
			}
		}
		else {
			for(int n =1; n<=firstDayOfWeek; n++) {
				System.out.print("    ");
			}
		}
		
		for(int i=1, w=firstDayOfWeek; i<lastDay; i++) {
			if(i<10) {
				System.out.print("   "+i);
			}
			else {
				System.out.print("  "+i);
			}
			w++;
			if(w>=7) {
				System.out.println();
				w=0;
			}
		}
//		System.out.println(date.get(Calendar.YEAR));
//		System.out.println(date.get(Calendar.MONTH));
//		System.out.println(date.get(Calendar.DAY_OF_MONTH));
	}
}

public class CalendarTest02 {
	public static void main(String[] args) {
		new CalendarView();
		CalendarView.getCalendar(2021, 01);
	}
}
