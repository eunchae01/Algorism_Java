import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String participants : participant){
            map.put(participants, map.getOrDefault(participants, 0) + 1);
        }
        
        for(String completions : completion){
            map.put(completions, map.getOrDefault(completions, 0) - 1);
        }
        
        for(String name : map.keySet()){
            if(map.get(name) != 0){
                answer = name;
            }
        }
        
        
        return answer;
    }
}