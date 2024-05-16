class Solution {
    public String solution(int n) {
        String answer = "";

        String[] arr = {"4", "1", "2"};

        while (n > 0){
            int num = n % 3;

            n /= 3;

            if (num == 0){
                n--;
            }

            answer = arr[num] + answer;
        }

        return answer;
    }
}