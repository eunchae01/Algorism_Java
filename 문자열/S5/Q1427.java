package 문자열.S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		String[] arr = num.split("");
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (String a :
				arr) {
			System.out.print(a);
		}
	}
}
