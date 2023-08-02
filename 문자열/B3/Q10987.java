package 문자열.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10987 {
	public static void main(String[] args) throws IOException {
		int count = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' | str.charAt(i) == 'e' | str.charAt(i) == 'i' | str.charAt(i) == 'o' | str.charAt(i) == 'u'){
				count++;
			}
		}
		
		System.out.println(count);
	}
}
