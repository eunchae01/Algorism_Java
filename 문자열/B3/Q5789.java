package 문자열.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String str = "";
		
		for (int i = 0; i < num; i++) {
			str = br.readLine();
			
			if(str.charAt(str.length()/2 - 1) == str.charAt(str.length()/2)){
				System.out.println("Do-it");
			}else{
				System.out.println("Do-it-Not");
			}
		}
	}
}
