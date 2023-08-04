package 문자열.B4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q26068 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		StringTokenizer st;
		
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine(), "-");
			
			String day = st.nextToken();
			int day2 = Integer.parseInt(st.nextToken());
			
			if (day2 <= 90){
				count++;
			}
		}
		
		System.out.println(count);
	}
}
