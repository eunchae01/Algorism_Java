package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2443 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			System.out.println(" " .repeat(i) + "*".repeat(2 * num - (i * 2 + 1)));
		}
	}
}
