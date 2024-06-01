class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        int my_len = my_string.length();
        int is_len = is_suffix.length();
        
        if(my_len >= is_len){
            String cut = my_string.substring(my_string.length() - is_suffix.length());
        
            if(cut.equals(is_suffix)){
                answer = 1;
            }
        }
        
        return answer;
    }
}