package 구현.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14909 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int count = 0;
		
		System.out.println(st.countTokens());
		
		for (int i = 0; i < st.countTokens(); i++) {
			if(Integer.parseInt(st.nextToken()) > 0){
				count++;
			}
		}
		
		System.out.println(count);
	}
}
