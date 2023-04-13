//문제
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

//출력
//첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력받기 위해 BufferedReader 클래스 호출

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");         //구분자로 " " 공백

        double A = Integer.parseInt(st.nextToken());                                //첫번째는 A에 저장
        double B = Integer.parseInt(st.nextToken());                                //두번째는 B에 저장

        System.out.println(A / B);                                                  //A / B 출력
    }
}
