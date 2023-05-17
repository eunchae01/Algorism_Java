//문제
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

//입력
//첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

//출력
//입력으로 주어진 숫자 N개의 합을 출력한다.

package 문자열;

import java.io.*;

public class Q11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num];

        String numArr = br.readLine();

        br.close();

        for (int i = 0; i < num; i++){
            sum += Integer.parseInt(String.valueOf(numArr.charAt(i)));
        }


        bw.write(String.valueOf(sum));

        bw.flush();
        br.close();
    }
}
