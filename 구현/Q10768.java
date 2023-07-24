package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10768 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int month = Integer.parseInt(br.readLine());
		int date = Integer.parseInt(br.readLine());
		
		if(month < 2){
			System.out.println("Before");
		} else if (month == 2) {
			if(date == 18){
				System.out.println("Special");
			} else if (date < 18) {
				System.out.println("Before");
			}else {
				System.out.println("After");
			}
		}else {
			System.out.println("After");
		}
	}
}
