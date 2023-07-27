package 구현.B3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q17263 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int[] arr = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		br.close();
		
		for (int i = 0; i < st.countTokens(); i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(arr[size - 1]);
		bw.flush();
		bw.close();
	}
}
