package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13752 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int his = 0;
		
		for (int i = 0; i < num; i++) {
			his = Integer.parseInt(br.readLine());
			
			System.out.println("=".repeat(his));
		}
	}
}
