package 문자열.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		long distinct;
		
		for (int i = 0; i < num; i++) {
			distinct = Long.parseLong(br.readLine());
			
			System.out.println(distinct % 2 == 0 ? "even" : "odd");
		}
	}
}
