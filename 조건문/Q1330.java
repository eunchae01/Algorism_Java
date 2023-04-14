//문제
//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

//입력
//첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

//출력
//첫째 줄에 다음 세 가지 중 하나를 출력한다.
//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.

package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력받기 위해 BufferedReader 클래스 호출

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");         //구분자 " "로 입력받음

        int A = Integer.parseInt(st.nextToken());                                   //첫번째 A에 저장
        int B = Integer.parseInt(st.nextToken());                                   //두번째 B에 저장

        if (A > B){                                                                 //A가 B보다 큰 경우에는
            System.out.println(">");                                                //'>'를 출력
        } else if (A < B) {                                                         //A가 B보다 작은 경우에는
            System.out.println("<");                                                //'<'를 출력
        }else {                                                                     //A와 B가 같은 경우에는
            System.out.println("==");                                               //'=='를 출력
        }
    }
}
