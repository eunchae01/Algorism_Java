import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
    
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            int[] arrA = new int[A];
            int[] arrB = new int[B];
            
            st = new StringTokenizer(br.readLine(), " ");
    
            for (int j = 0; j < arrA.length; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }
    
            st = new StringTokenizer(br.readLine(), " ");
            
            for (int j = 0; j < arrB.length; j++) {
                arrB[j] = Integer.parseInt(st.nextToken());
            }
    
            Arrays.sort(arrA);
            Arrays.sort(arrB);
            
            int lt = 0, rt = 0, cnt = 0;
            
            while (lt < A){
                if (rt != B && arrA[lt] > arrB[rt]){
                    cnt++;
                    rt++;
                } else if (rt == B) {
                    lt++;
                    rt = 0;
                } else {
                    lt++;
                    rt = 0;
                }
            }
    
            System.out.println(cnt);
        }
    }
}
