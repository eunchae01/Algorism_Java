package 문자열.B3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double num1 = Double.parseDouble(br.readLine().trim());
		String op = br.readLine();
		double num2 = Double.parseDouble(br.readLine().trim());
		
		if (op.equals("+")){
			System.out.println(num1 + num2);
		}else{
			System.out.println(num1 * num2);
		}
	}
}
