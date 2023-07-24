package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4999 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String cus = br.readLine();
		String doc = br.readLine();
		
		if(cus.length() > doc.length()){
			System.out.println("go");
		}else {
			System.out.println("no");
		}
	}
}
