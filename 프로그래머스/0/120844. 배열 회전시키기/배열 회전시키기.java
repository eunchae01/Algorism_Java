import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers, String direction) {
        ArrayList<Integer> list = new ArrayList<>();
        
        
        if(direction.equals("left")){
            for(int i = 1; i < numbers.length; i++){
                list.add(numbers[i]);
            }
            
            list.add(numbers[0]);
        }else{
            list.add(numbers[numbers.length - 1]);
            
            for(int i = 0; i < numbers.length - 1; i++){
                list.add(numbers[i]);
            }
        }
        
        return list;
    }
}