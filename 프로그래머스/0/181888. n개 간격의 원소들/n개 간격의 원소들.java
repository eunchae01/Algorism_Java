class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        
        if(len % n == 0){
            len /= n;
        }else{
            len /= n;
            len++;
        }
        
        int[] answer = new int[len];
        
        int index = 0;
        
        for(int i = 0; i < num_list.length; i = i + n){
            answer[index] = num_list[i];
            
            index++;
        }
        
        return answer;
    }
}