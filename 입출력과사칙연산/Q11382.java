//문제
//꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

//입력
//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.

//출력
//A+B+C의 값을 출력한다.

package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력받기 위해 BufferedReader 클래스 호출

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");         //구분자 " "로 입력받음

        long A = Long.parseLong((st.nextToken()));                                  //첫번째 A에 저장
        long B = Long.parseLong((st.nextToken()));                                  //두번째 B에 저장
        long C = Long.parseLong((st.nextToken()));                                  //세번째 C에 저장

        System.out.println(A + B + C);                                              //A+B+C의 값 출력
    }
}
