//문제
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

//입력
//첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

//출력
//시험 성적을 출력한다.

package 조건문;

import java.util.Scanner;

public class Q9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //입력받기 위해 Scanner 클래스 호출

        int score = sc.nextInt();               //score에 입력받은 수 저장

        sc.close();                             //다 입력받았으니 닫아줌

        if (score >= 90){                       //90 ~ 100점
            System.out.println("A");            //A
        } else if (score >= 80) {               //80 ~ 89점
            System.out.println("B");            //B
        } else if (score >= 70) {               //70 ~ 79점
            System.out.println("C");            //C
        } else if (score >= 60) {               //60 ~ 69점
            System.out.println("D");            //D
        }else {                                 //나머지 점수
            System.out.println("F");            //F
        }
    }
}
