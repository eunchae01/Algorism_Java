import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            for(int j = start; j <= end; j++){
                answer.add(arr[j]);
            }
        }
        
        return answer;
    }
}