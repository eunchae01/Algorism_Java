import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> answer = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(answer.empty()){
                answer.add(arr[i]);
            }else{
                if(!(answer.peek() == arr[i])){
                    answer.add(arr[i]);
                }
            }
        }
        
        return answer;
    }
}