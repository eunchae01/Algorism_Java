class Solution {
    public String solution(int n) {
        String answer = "";
        
        String melon = "수박";
        
        if(n % 2 == 0){
            answer += melon.repeat(n / 2);
        }else{
            answer += melon.repeat(n / 2);
            answer += "수";
        }
        
        return answer;
    }
}