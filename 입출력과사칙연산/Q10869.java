//문제
//두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

//입력
//두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

//출력
//첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력받기 위해 BufferedReader 클래스 호출

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");         //구분자로 " " 공백

        Integer A = Integer.parseInt(st.nextToken());                               //첫번째는 A에 저장
        Integer B = Integer.parseInt(st.nextToken());                               //두번째는 B에 저장

        System.out.println(A + B);                                                  //A + B 출력
        System.out.println(A - B);                                                  //A - B 출력
        System.out.println(A * B);                                                  //A * B 출력
        System.out.println(A / B);                                                  //A / B 출력
        System.out.println(A % B);                                                  //A % B 출력
    }
}
