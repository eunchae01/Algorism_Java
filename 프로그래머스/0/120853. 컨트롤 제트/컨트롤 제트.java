import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] list = s.split(" ");
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < list.length; i++){
            if (!list[i].equals("Z")){
                stack.add(Integer.parseInt(list[i]));
            }else{
                stack.pop();
            }
        }
        
        for(int a : stack){
            answer += a;
        }
        
    
        return answer;
    }
}