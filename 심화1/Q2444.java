/*
문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
*/

package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			System.out.println(" ".repeat(N - (i + 1)) + "*".repeat(i * 2 + 1));
		}
		
		for (int i = N; i > 1; i--) {
			System.out.println(" ".repeat(N - i + 1) + "*".repeat((i - 1) * 2 - 1));
		}
	}
}
