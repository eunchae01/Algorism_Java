package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10824 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		String C = st.nextToken();
		String D = st.nextToken();
		
		String num1 = A + B;
		String num2 = C + D;
		
		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
	}
}
