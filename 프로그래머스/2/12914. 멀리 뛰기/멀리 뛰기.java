class Solution {
    public long solution(int n) {
        int[] jump = new int[n + 1];
        
        jump[1] = 1;
        
        if(n > 1){
            jump[2] = 2;
        }
        
        if(n > 2){
            for(int i = 3; i < jump.length; i++){
                jump[i] = (jump[i - 1] + jump[i - 2]) % 1234567;
            }
        }
        
        return jump[n];
    }
}