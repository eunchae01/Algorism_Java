//문제
//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//출력
//첫째 줄에 A-B를 출력한다.

package 입출력과사칙연산;

import java.util.Scanner;

public class Q1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //입력받기 위해 Scanner 클래스 호출

        int A = scanner.nextInt();                  //A값 입력받음
        int B = scanner.nextInt();                  //B값 입력받음

        System.out.println(A - B);                  //A-B 출력

        scanner.close();                            //사용 끝난 scanner 닫아주기
    }
}
