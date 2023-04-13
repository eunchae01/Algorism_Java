package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력받기 위해 BufferedReader 클래스 호출

        String[] str = br.readLine().split(" ");                              //구분자로 " " 공백

        int A = Integer.parseInt(str[0]);                                           //첫번째는 A에 저장
        int B = Integer.parseInt(str[1]);                                           //두번째는 B에 저장

        System.out.println(A * B);                                                  //A * B 출력
    }
}
