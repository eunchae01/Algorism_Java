package 문자열.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10102 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int V = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A'){
				a++;
			}else {
				b++;
			}
		}
		
		System.out.println(a > b ? "A" : a == b ? "Tie" : "B");
	}
}
