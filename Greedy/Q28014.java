package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q28014 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] < arr[i + 1]){
				count++;
			}
		}
		
		System.out.println(count + 1);
	}
}
