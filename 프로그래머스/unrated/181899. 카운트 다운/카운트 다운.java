import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int start, int end_num) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = start; i >= end_num; i--){
            list.add(i);
        }
        
        
        return list;
    }
}