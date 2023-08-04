package 문자열.B1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();
		
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(String.valueOf(str1.charAt(i)) + String.valueOf(str1.charAt(i)) + String.valueOf(str3.charAt(i)) + String.valueOf(str4.charAt(i)) + String.valueOf(str5.charAt(i)));
		}
	}
}
