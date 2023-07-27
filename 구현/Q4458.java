package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4458 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String str1 = "";
		String str2 = "";
		
		for (int i = 0; i < num; i++) {
			str1 = br.readLine();
			
			for (int j = 0; j < str1.length(); j++) {
				if(j == 0){
					str2 += Character.toUpperCase(str1.charAt(0));
				}else {
					str2 += str1.charAt(j);
				}
			}
			System.out.println(str2);
			
			str1 = "";
			str2 = "";
		}
	}
}
