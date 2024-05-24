import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int getNum = nums.length / 2;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        answer = Math.min(getNum, map.size());
        
        return answer;
    }
}