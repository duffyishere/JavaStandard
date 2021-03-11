package mySelfStudy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

class AnniversaryCalculator{
	
	public String getDate() {
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		String  day = year+"/"+month+"/"+date;
		return day;
	}
	
	public String getAnniversartDate(int day) {
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DATE, day);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		String  afterDay = year+"/"+month+"/"+date;
		
		return afterDay;
	}
	
}

class InputDate<T>{
	int date;
	
	public <E> Boolean inputDate(){
		try {
			String get = JOptionPane.showInputDialog("Input numbeFill out the anniversary you want to view.");
			date = Integer.parseInt(get);
			return true;
		}catch(Exception e) {
			System.out.println("Input only number!");		
			return false;
		}
	}
}

class AnniversaryCalculatorEx01 {
	public static void main(String[] args) {
		AnniversaryCalculator day = new AnniversaryCalculator();
		InputDate<Integer> inputDate = new InputDate<>();
	
		if(inputDate.inputDate()) {
			System.out.println("Today Date :"+day.getDate());
			System.out.println(inputDate.date+" days later :"+day.getAnniversartDate(inputDate.date));	
		}
	}
}