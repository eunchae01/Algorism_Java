import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        int[] arr1 = new int[arr.length];
        
        for(int i = 0; i < arr1.length; i++){
           arr1[i] = Integer.valueOf(arr[i]); 
        }
        
        Arrays.sort(arr1);
        
        answer += arr1[0] + " ";
        answer += arr1[arr1.length - 1];
        
        return answer;
    }
}