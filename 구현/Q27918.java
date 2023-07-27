package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27918 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int D = 0;
		int P = 0;
		
		int game = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < game; i++) {
			if(br.readLine().equals("D")){
				D++;
			}else {
				P++;
			}
			
			if(Math.abs(D - P) >= 2){
				break;
			}
		}
		
		System.out.println(D + ":" + P);
	}
}
