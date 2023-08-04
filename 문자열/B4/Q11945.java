package 문자열.B4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q11945 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int repeat = Integer.parseInt(st.nextToken());
		int vol = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		for (int i = 0; i < repeat; i++) {
			hashMap.put(i, br.readLine());
		}
		
		for (int i = 0; i < repeat; i++) {
			for (int j = vol; j > 0; j--) {
				System.out.print(hashMap.get(i).charAt(j - 1));
			}
			System.out.println();
		}
	}
}
