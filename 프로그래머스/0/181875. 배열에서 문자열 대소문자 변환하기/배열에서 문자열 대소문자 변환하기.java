class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i = 0; i < strArr.length; i ++){
            String str = "";
            
            for(int j = 0; j < strArr[i].length(); j++){
                if(i % 2 == 0){
                    str += Character.toLowerCase(strArr[i].charAt(j));
                }else{
                    str += Character.toUpperCase(strArr[i].charAt(j));
                }
            }
            
            answer[i] = str;
        }
        
        return answer;
    }
}