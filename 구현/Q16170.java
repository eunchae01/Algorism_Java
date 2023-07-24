package 구현;

import java.time.LocalDate;

public class Q16170 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		int year = date.getYear();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}
}
