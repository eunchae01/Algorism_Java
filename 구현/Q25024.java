package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25024 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		
		int time = -1;
		int min = -1;
		
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			time = Integer.parseInt(st.nextToken());
			min = Integer.parseInt(st.nextToken());
			
			if(time < 24){
				System.out.print("Yes ");
			}else {
				System.out.println("No ");
			}
			
			if(min < 60){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
