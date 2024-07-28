import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
                
        int cnt = 0;                                           
                                                    
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                answer.add(cnt);
                
                cnt = 0;
            }else{
                cnt++;
            }
        }
        
        answer.add(cnt);
        
        return answer;
    }
}