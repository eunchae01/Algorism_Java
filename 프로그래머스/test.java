package 프로그래머스;

import java.io.IOException;

public class test {
	public static void main(String[] args) throws IOException {
		Solution solution = new Solution();

		System.out.println(solution.solution("3people unFollowed me"));
	}
	
	static class Solution {
		public String solution(String s){
			String answer = "";
			
			s = s.toLowerCase();
			
			if (Character.isLowerCase(s.charAt(0))){
				answer += Character.toUpperCase(s.charAt(0));
			}else {
				answer += s.charAt(0);
			}
			
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i - 1) == ' ' & s.charAt(i) != ' '){
					answer += Character.toUpperCase(s.charAt(i));
				}else {
					answer += s.charAt(i);
				}
			}
			
			return answer;
		}
	}
}

