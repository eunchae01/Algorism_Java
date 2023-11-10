class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String str = String.valueOf(num_str);
        
        for(int i = 0; i < num_str.length(); i++){
            answer += num_str.charAt(i) - 48;
        }
        
        return answer;
    }
}