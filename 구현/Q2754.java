/*
문제
어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
A+: 4.3, A0: 4.0, A-: 3.7
B+: 3.3, B0: 3.0, B-: 2.7
C+: 2.3, C0: 2.0, C-: 1.7
D+: 1.3, D0: 1.0, D-: 0.7
F: 0.0

입력
첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.

출력
첫째 줄에 C언어 평점을 출력한다.
*/

package 구현;

import java.util.Scanner;

public class Q2754 {
	public static void main(String[] args) {
		String[] arr1 = new String[13];
		
		arr1[0] = "A+"; arr1[1] = "A0"; arr1[2] = "A-";
		arr1[3] = "B+"; arr1[4] = "B0"; arr1[5] = "B-";
		arr1[6] = "C+"; arr1[7] = "C0"; arr1[8] = "C-";
		arr1[9] = "D+"; arr1[10] = "D0"; arr1[11] = "D-";
		arr1[12] = "F";
		
		double[] arr2 = new double[13];
		
		arr2[0] = 4.3; arr2[1] = 4.0; arr2[2] = 3.7;
		arr2[3] = 3.3; arr2[4] = 3.0; arr2[5] = 2.7;
		arr2[6] = 2.3; arr2[7] = 2.0; arr2[8] = 1.7;
		arr2[9] = 1.3; arr2[10] = 1.0; arr2[11] = 0.7;
		arr2[12] = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		String grade = sc.next();
		
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i].equals(grade)){
				System.out.println(arr2[i]);
				
				break;
			}
		}
	}
}
