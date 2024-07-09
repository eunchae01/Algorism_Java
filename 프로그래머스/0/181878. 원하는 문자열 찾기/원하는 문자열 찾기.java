class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String myStringLow = "";
        String patLow = "";
        
        for(int i = 0; i < myString.length(); i++){
            myStringLow += Character.toLowerCase(myString.charAt(i));
        }
        
        for(int i = 0; i < pat.length(); i++){
            patLow += Character.toLowerCase(pat.charAt(i));
        }
        
        if(myStringLow.contains(patLow)){
            answer = 1;
        }
        
        return answer;
    }
}