class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String strNum = String.valueOf(num);
        String strK = String.valueOf(k);
        
        if(strNum.contains(strK)){
            answer = strNum.indexOf(strK) + 1;
        }
        
        return answer;
    }
}