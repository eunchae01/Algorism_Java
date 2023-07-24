package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14645 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int stop = Integer.parseInt(st.nextToken());
		int in = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < stop; i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			in = Integer.parseInt(st.nextToken());
			int out = Integer.parseInt(st.nextToken());
		}
		
		System.out.println("비와이");
	}
}
