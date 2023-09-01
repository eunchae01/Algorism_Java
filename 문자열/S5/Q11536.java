package 문자열.S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q11536 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String[] arr = new String[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = br.readLine();
		}
		
		String[] sort = new String[num];
		
		for (int i = 0; i < num; i++) {
			sort[i] = arr[i];
		}
		
		Arrays.sort(sort);
		
		boolean ascFlag = true;
		
		for (int i = 0; i < num; i++) {
			if (arr[i] != sort[i]){
				ascFlag = false;
			}
		}
		
		boolean descFlag = true;
		
		Arrays.sort(sort, Collections.reverseOrder());
		
		for (int i = 0; i < num; i++) {
			if (arr[i] != sort[i]){
				descFlag = false;
			}
		}
		
		if (ascFlag){
			System.out.println("INCREASING");
		} else if (descFlag) {
			System.out.println("DECREASING");
		}else {
			System.out.println("NEITHER");
		}
	}
}
