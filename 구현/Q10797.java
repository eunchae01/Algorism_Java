package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10797 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[5];
		
		int count = 0;
		
		for(int i = 0; i < 5; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] == a){
				count++;
			}
		}
		System.out.println(count);
	}
}
