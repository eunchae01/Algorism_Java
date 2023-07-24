package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int L = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		
		int[] arr = new int[5];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < 5; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			
			System.out.print(arr[i] - L + " ");
		}
	}
}
