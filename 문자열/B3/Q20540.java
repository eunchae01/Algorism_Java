package 문자열.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q20540 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String mbti = br.readLine();
		String mbti2 = "";
		
		if (mbti.charAt(0) == 'E'){
			mbti2 += 'I';
		}else {
			mbti2 += 'E';
		}
		
		if (mbti.charAt(1) == 'N'){
			mbti2 += 'S';
		}else {
			mbti2 += 'N';
		}
		
		if (mbti.charAt(2) == 'T'){
			mbti2 += 'F';
		}else {
			mbti2 += 'T';
		}
		
		if (mbti.charAt(3) == 'P'){
			mbti2 += 'J';
		}else {
			mbti2 += 'P';
		}
		
		System.out.println(mbti2);
	}
}
