//문제
//(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

//입력
//첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

//출력
//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력받기 위해 BufferedReader 클래스 호출

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");         //구분자 " "로 입력받음

        int A = Integer.parseInt(st.nextToken());                                   //첫번째 A에 저장
        int B = Integer.parseInt(st.nextToken());                                   //두번째 B에 저장
        int C = Integer.parseInt(st.nextToken());                                   //세번째 C에 저장

        System.out.println((A+B)%C);                                                //첫째 줄에 (A+B)%C 출력
        System.out.println(((A%C) + (B%C))%C);                                      //둘째 줄에 ((A%C) + (B%C))%C 출력
        System.out.println((A*B)%C);                                                //셋째 줄에 (A*B)%C 출력
        System.out.println(((A%C) * (B%C))%C);                                      //넷째 줄에 ((A%C) * (B%C))%C 출력
    }
}
