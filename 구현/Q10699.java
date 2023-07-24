/*
문제
서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.

입력
입력은 없다.

출력
서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
*/

package 구현;

import java.util.Calendar;

public class Q10699 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.printf("%04d-%02d-%02d", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DATE));
	}
}
