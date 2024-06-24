import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String num = String.valueOf(n);
        
        String[] strArr = new String[num.length()];
        
        for(int i = 0; i < num.length(); i++){
            strArr[i] = num.substring(i, i + 1);
        }
        
        Arrays.sort(strArr, Collections.reverseOrder());
        
        num = "";
        
        for(String a : strArr){
            num += a;
        }
        
        answer = Long.valueOf(num);
        
        return answer;
    }
}