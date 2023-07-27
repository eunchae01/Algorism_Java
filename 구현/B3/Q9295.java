package 구현.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9295 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			System.out.println("Case " + (i + 1) + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
			
		}
	}
}
