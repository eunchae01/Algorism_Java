package 문자열.B2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2789 {
	public static void main(String[] args) throws IOException {
		String cam = "CAMBRIDGE";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String str2 = "";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < cam.length(); j++) {
				if(str.charAt(i) == cam.charAt(j)){
					continue;
				}else {
					str2 += str.charAt(i);
				}
			}
		}
	}
}
