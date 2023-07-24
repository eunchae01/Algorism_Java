package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1264 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		str = str.toLowerCase();
		
		int count = 0;
		
		while (!str.equals("#")){
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == 'a' | str.charAt(i) == 'e' | str.charAt(i) == 'u' | str.charAt(i) == 'i' | str.charAt(i) == 'o'){
					count++;
				}
			}
			System.out.println(count);
			
			str = br.readLine();
			count = 0;
		}
		
	}
}
