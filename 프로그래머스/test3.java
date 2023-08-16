package 프로그래머스;

public class test3 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		System.out.println(solution.solution("a"));
	}
	
	static class Solution{
		public int solution(String s){
			if (s.length() == 1){
				return 1;
			}
			
			int x = 0, y = 0, word = 0, index = 1;
			
			char s1;
			
			s1 = s.charAt(0);
			x = 1;
			
			for (int i = 1; i < s.length(); i = index) {
				if (x == y){
					word += 1;

					s1 = s.charAt(index);
					
					x = 0; y = 0;
				}

				if(s.charAt(i) == s1){
					x += 1;
				}else {
					y += 1;
				}
				index++;
				
				if(i == s.length() - 1){
					word++;
				}
				
			}
			
			return word;
		}
	}
}
