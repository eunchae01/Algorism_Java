class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int plus = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        
        if(plus > 2 * a * b){
            answer = plus;
        }else{
            answer = 2 * a * b;
        }
        
        return answer;
    }
}