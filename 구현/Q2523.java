package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2523 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			System.out.println("*".repeat(i + 1));
		}
		for (int i = num; i > 0; i--) {
			System.out.println("*".repeat(i - 1));
		}
	}
}
