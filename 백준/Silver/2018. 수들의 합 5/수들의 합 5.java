import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
    
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        
        int lt = 0, rt = 1, cnt = 1, answer = 0;
    
        while (lt < N){
            if (cnt < N && lt < rt){
                cnt += arr[rt++];
            } else if (cnt == N) {
                answer++;
                
                cnt -= arr[lt++];
            } else {
                cnt -= arr[lt++];
            }
        }
    
        System.out.println(answer);
    }
}
