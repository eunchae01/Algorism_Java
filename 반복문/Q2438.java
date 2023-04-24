//문제
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

//입력
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

//출력
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

package 반복문;

import java.io.*;

public class Q2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        br.close();

        for (int i = 1; i < N + 1; i++){
            for (int j = 0; j < i; j++){
                bw.write("*");
            }
            bw.newLine();;
        }
        bw.flush();
        bw.close();
    }
}
