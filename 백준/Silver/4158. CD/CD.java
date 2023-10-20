import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
    
        int N, M;
        
        st = new StringTokenizer(br.readLine());
    
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        while (N != 0 && M != 0){
            int[] arr1 = new int[N];
    
            for (int i = 0; i < N; i++) {
                arr1[i] = Integer.parseInt(br.readLine());
            }
    
            int[] arr2 = new int[M];
    
            for (int i = 0; i < M; i++) {
                arr2[i] = Integer.parseInt(br.readLine());
            }
    
            int lt = 0, rt = 0, answer = 0;
    
            while(lt < N && rt < M){
                if (arr1[lt] < arr2[rt]){
                    lt++;
                } else if (arr1[lt] == arr2[rt]) {
                    answer++;
            
                    lt++;
                    rt++;
                } else {
                    rt++;
                }
            }
    
            System.out.println(answer);
    
            st = new StringTokenizer(br.readLine());
    
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }
        
        
    }
}
