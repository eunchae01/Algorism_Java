class Solution {
    public int solution(int n) {
        int answer = 0;
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		
		int lt = 0, rt = 0, cnt = 0;
		
		while (lt < n & rt < n){
			if (cnt < n & arr[rt] < n){
				cnt += arr[rt++];
			} else if (cnt < n & arr[rt] == n) {
				cnt -= arr[lt++];
			}else if (cnt > n) {
				cnt -= arr[lt++];
			} else {
				answer++;
				
				cnt -= arr[lt++];
			}
		}
		
		return answer + 1;
    }
}