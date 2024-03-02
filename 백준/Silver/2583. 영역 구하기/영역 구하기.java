import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int M, N;
    static int answer = 0;
    static int area = 0;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    private static void DFS(int[][] arr, int x, int y){
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N && arr[nx][ny] == 0){
                area++;

                arr[nx][ny] = 2;

                DFS(arr, nx, ny);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr = new int[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int b = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            for (int j = a; j < c; j++) {
                for (int k = b; k < d; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0){
                    answer++;
                    area = 1;

                    arr[i][j] = 2;

                    DFS(arr, i ,j);

                    list.add(area);
                }
            }
        }

        Collections.sort(list);

        System.out.println(answer);

        for (int a :
                list) {
            System.out.print(a + " ");
        }
    }
}