import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length - 5;
        
        int[] answer = new int[size];
        
        Arrays.sort(num_list);
        
        for(int i = 5; i < num_list.length; i++){
            answer[i - 5] = num_list[i];
        }
        
        return answer;
    }
}