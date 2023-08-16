package 문자열.S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8892 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			
			String[] arr = new String[k];
			
			for (int j = 0; j < k; j++) {
				arr[j] = br.readLine();
			}

			String check = "";
			String check2 = "";
			int checkNum = 0;
			
			Loop1:
			for (int j = 0; j < k - 1; j++) {
				for (int l = 0; l < k; l++) {
					if (j == l) {
						continue ;
					}
					check = arr[j];
					check += arr[l];
					
					System.out.println(check + " " + j + " " + l);
					
					String palenCheck = new StringBuilder(check).reverse().toString();
					
					if (check.equals(palenCheck)) {
						System.out.println(check);
						checkNum++;
						break Loop1;
					}

					check = "";
					
				}
			}
			if (checkNum == 0) {
				System.out.println(checkNum);
			}
		}
	}
}
