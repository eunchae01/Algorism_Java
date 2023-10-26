class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        int num = is_prefix.length();
        
        if(num <= my_string.length()){
            if(my_string.substring(0, num).equals(is_prefix)){
                answer = 1;
            }
        }
        
        
        return answer;
    }
}