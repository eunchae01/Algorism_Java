package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr1 = new int[4];
		int[] arr2 = new int[2];
		
		for (int i = 0; i < 4; i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < 2; i++) {
			arr2[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int sum = 0;
		
		for (int i = 1; i < arr1.length; i++) {
			sum += arr1[i];
		}
		
		sum += arr2[1];
		
		System.out.println(sum);
	}
}
