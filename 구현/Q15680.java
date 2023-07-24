/*
문제
연세대학교의 영문명은 YONSEI, 슬로건은 Leading the Way to the Future이다.
이를 출력하는 프로그램을 작성해보도록 하자.

입력
첫째 줄에 N이 주어진다. (N = 0 또는 1)

출력
N = 0일 경우: 연세대학교의 영문명을 출력한다.
N = 1일 경우: 연세대학교의 슬로건을 출력한다.
대소문자 구별에 주의하도록 하자.
*/

package 구현;

import java.util.Scanner;

public class Q15680 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N == 0){
			System.out.println("YONSEI");
		}else {
			System.out.println("Leading the Way to the Future");
		}
	}
}
