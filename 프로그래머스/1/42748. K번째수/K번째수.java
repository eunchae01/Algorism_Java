import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++){
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];
            
            for(int j = 0; j < arr.length; j++){
                arr[j] = array[commands[i][0] + j - 1];
            }
            
            Arrays.sort(arr);
            
            answer.add(arr[commands[i][2] - 1]);
        }
        
        return answer;
    }
}