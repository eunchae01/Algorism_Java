package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11034 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int num3 = Integer.parseInt(st.nextToken());
			
			if(Math.abs(num1 - num2) > Math.abs(num2 - num3)){
				System.out.println(Math.abs(num1 - num2) - 1);
			}else {
				System.out.println(Math.abs(num2 - num3) - 1);
			}
		}
		
	}
}
