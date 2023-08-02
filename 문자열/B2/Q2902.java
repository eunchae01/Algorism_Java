package 문자열.B2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2902 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		
		String st1 = st.nextToken();
		String st2 = st.nextToken();
		
		System.out.println((st1.charAt(0) - '0') + (st2.charAt(0) - '0'));
	}
}
