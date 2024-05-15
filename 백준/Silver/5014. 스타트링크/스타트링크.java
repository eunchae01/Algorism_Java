import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int F, S, G, U, D;

    static int[] check;

    static public String  BFS(){
        Queue<Integer> q = new LinkedList<>();

        q.offer(S);
        check[S] = 1;

        while (!q.isEmpty()){
            int tmp = q.poll();

            if (tmp == G){
                return String.valueOf(check[tmp] - 1);
            }

            if (tmp + U <= F && check[tmp + U] == 0){
                q.offer(tmp + U);
                check[tmp + U] = check[tmp] + 1;
            }

            if (tmp - D >= 1 && check[tmp - D] == 0){
                q.offer(tmp - D);
                check[tmp - D] = check[tmp] + 1;
            }
        }

        return "use the stairs";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

       check = new int[F + 1];

        System.out.println(BFS());
    }
}
