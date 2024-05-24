class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String a_string = String.valueOf(a);
        String b_string = String.valueOf(b);
        
        a_string += b;
        b_string += a;
        
        a = Integer.parseInt(a_string);
        b = Integer.parseInt(b_string);
        
        answer = Math.max(a, b);
        
        return answer;
    }
}