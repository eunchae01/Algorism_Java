class Solution {
    public long solution(long n) {
        long answer = -1;
        
        if(n > 1){
            long num = n / 2;
        
            for(int i = 1; i <= num; i++){
                if(Math.pow(i, 2) == n){
                    return (long)Math.pow(i + 1, 2);
                }
            }
        }else{
            return 4;
        }
        
        
        return answer;
    }
}