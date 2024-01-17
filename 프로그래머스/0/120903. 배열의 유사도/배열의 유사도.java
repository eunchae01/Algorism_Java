class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String a : s2){
            for(int i = 0; i < s1.length; i++){
                if(a.equals(s1[i])){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}