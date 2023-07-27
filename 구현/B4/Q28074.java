package 구현.B4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q28074 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int[] arr = new int[5];
		
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == 'M' & arr[0] == 0){
				arr[0]++;
			} else if (str.charAt(i) == 'O' & arr[1] == 0) {
				arr[1]++;
			} else if (str.charAt(i) == 'B' & arr[2] == 0) {
				arr[2]++;
			} else if (str.charAt(i) == 'I' & arr[3] == 0) {
				arr[3]++;
			} else if (str.charAt(i) == 'S' & arr[4] == 0) {
				arr[4]++;
			}
		}
		
		int count = 0;
		
		for (int i :
				arr) {
			if(i == 1){
				count++;
			}
		}
		
		if (count == 5){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
