package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14489 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int chicken = Integer.parseInt(br.readLine());
		
		if(chicken * 2 <= a + b ){
			System.out.println(a + b - chicken * 2);
		}else {
			System.out.println(a + b);
		}
	}
}
