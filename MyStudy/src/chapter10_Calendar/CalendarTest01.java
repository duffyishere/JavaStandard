package chapter10_Calendar;

import java.util.Calendar;

class GetDate{
	final String[] month = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};	
	
	Calendar cal = Calendar.getInstance();
	
	public String toString() {
		return month[cal.get(Calendar.MONTH)]+" "+Calendar.DAY_OF_WEEK+"th, "+cal.get(Calendar.YEAR);
	}
}

public class CalendarTest01 {
	public static void main(String[] args) {
		System.out.println(new GetDate().toString());
	}
}

