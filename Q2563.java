import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2563 {
	public static void main(String[] args) throws IOException {
		int[][] arr = new int[100][100];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int a , b;
		
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			for (int j = a; j < a + 10; j++) {
				for (int k = b; k < b + 10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		int width = 0;
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (arr[i][j] == 1){
					width++;
				}
			}
		}
		
		System.out.println(width);
	}
}
