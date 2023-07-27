package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int index = 1;
		int count = 0;
		
		for (int i :
				arr) {
			if ((i) != index){
				count++;
			}
			
			index++;
		}
		
		System.out.println(count);
	}
}
