package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25372 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		String pwd = "";
		
		for (int i = 0; i < test; i++){
			pwd = br.readLine();
			
			if(pwd.length() >= 6 & pwd.length() <= 9){
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}
