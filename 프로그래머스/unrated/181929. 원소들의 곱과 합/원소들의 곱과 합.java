class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int add = 0;
        int multi = 1;
        
        for(int i = 0; i < num_list.length; i++){
            add += num_list[i];
            multi *= num_list[i];
        }
        
        if(add*add > multi){
            answer = 1;
        }
        
        
        return answer;
    }
}