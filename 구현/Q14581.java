package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String id = br.readLine();
		
		System.out.println(":fan::fan::fan:");
		System.out.println(":fan::" + id + "::fan:");
		System.out.println(":fan::fan::fan:");
	}
}
