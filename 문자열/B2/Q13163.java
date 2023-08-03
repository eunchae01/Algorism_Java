package 문자열.B2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13163 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			String[] arr = br.readLine().split(" ");
			
			String str = "god";
			
			for (int j = 1; j < arr.length; j++) {
				str += arr[j];
			}
			
			System.out.println(str);
			
		}
	}
}
