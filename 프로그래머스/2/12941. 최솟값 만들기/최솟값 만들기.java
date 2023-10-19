
import java.util.Arrays;
import java.util.Collections;

class Solution
{
	public int solution(int []A, int []B)
	{
		int answer = 0;
		
		Arrays.sort(A);
		
		Integer[] arr3 = new Integer[B.length];
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = B[i];
		}
		
		Arrays.sort(arr3, Collections.reverseOrder());
		
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * arr3[i];
		}
		
		return answer;
	}
}