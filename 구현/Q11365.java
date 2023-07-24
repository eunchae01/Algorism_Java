package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11365 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		while (!str.equals("END")) {
			for(int i = 0; i < str.length(); i++){
				System.out.print(str.charAt(str.length() - 1 - i));
			}
			System.out.println();
			str = br.readLine();
		}
	}
}
