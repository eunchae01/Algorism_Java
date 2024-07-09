class Solution {
    public String[] solution(String[] names) {
        int namesLen = names.length;
        
        if(namesLen % 5 == 0){
            namesLen /= 5;
        }else{
            namesLen /= 5;
            namesLen++;
        }
        
        String[] answer = new String[namesLen];
        
        int index = 0;
        
        for(int i = 0; i < names.length; i = i + 5){
            answer[index] = names[i];
            
            index++;
            
        }
        
        return answer;
    }
}