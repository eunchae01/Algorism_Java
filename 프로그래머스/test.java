package 프로그래머스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < T; i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			System.out.println("Case #" + (i + 1) + ": " + (A + B));
		}
	}
}

class Solution {
	public int solution(int price) {
		double answer = 0;
		
		if(price >= 500000){
			answer = (double)price * 0.8;
		}else if(price >= 300000){
			answer = (double)price * 0.90;
		}else if(price >= 100000){
			answer = (double)price * 0.95;
		}
		System.out.println(answer);
		
		return (int)answer;
	}
}