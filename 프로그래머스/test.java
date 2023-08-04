package 프로그래머스;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) throws IOException {
		Solution solution = new Solution();
		
		System.out.println(solution.solution("Bcad"));
		
		
	}
}

class Solution {
	public String solution(String my_string) {
		String answer = "";
		
		char[] arr = my_string.toCharArray();
		
		Arrays.sort(arr);
		
		for (char i :
				arr) {
			answer += i;
		}
		
		return answer;
	}
}