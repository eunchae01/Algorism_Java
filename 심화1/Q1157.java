/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/

package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		String word = br.readLine();
		br.close();
		
		word = word.toUpperCase();
		
		for (int i = 0; i < word.length(); i++) {
			arr[word.charAt(i) - 65] += 1;
		}

		int max = -1;
		
		char duplicate = '?';
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max){
				max = arr[i];
				
				duplicate = (char) (i + 65);
			} else if (arr[i] == max) {
				duplicate = '?';
			}
		}
		System.out.println(duplicate);
	}
}
