package 문자열.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q26040 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String[] arr = br.readLine().split(" ");
		
		System.out.println(arr[0]);
		
		String str3 = "";
		
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(str1.substring(i, i + 1) + arr[j]);
				if(str1.substring(i, i + 1) == arr[j]){
					str3 += arr[j].toLowerCase();
				}else {
					str3 += str1.substring(i, i + 1);
				}
			}
		}
		
		System.out.println(str3);
	}
}
