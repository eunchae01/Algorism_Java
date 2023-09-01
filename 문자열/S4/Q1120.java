package 문자열.S4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		int diff = str1.length();
		
		if (str1.length() == str2.length()){
			int temp = 0;
			
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)){
					temp++;
				}
				diff = temp;
			}
		}else if (str2.contains(str1)){
			diff = 0;
		}else {
			for (int i = 0; i <= str2.length() - str1.length(); i++) {
				int temp = str1.length();
				
				for (int j = 0; j < str1.length(); j++) {
					if (str1.charAt(j) == str2.charAt(i + j)) {
						temp--;
					}
					
				}if (temp < diff) {
					diff = temp;
				}
			}
		}
		System.out.println(diff);
	}
}
