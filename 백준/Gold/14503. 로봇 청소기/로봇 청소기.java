import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Q14503 q14503 = new Q14503();
        q14503.q14503();
    }
}

class Q14503{
    int N, M;
    int[][] arr;
    int answer = 1;

    // arr상 북, 동, 남, 서
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    private void DFS(int r, int c, int d){
        arr[r][c] = 2;

        for (int i = 0; i < 4; i++) {
            d = (d + 3) % 4;
            int nx = r + dx[d];
            int ny = c + dy[d];

            if (nx >= 0 && nx < N && ny >= 0 && ny < M && arr[nx][ny] == 0){
                answer++;

                arr[nx][ny] = 2;

                DFS(nx, ny, d);

                return;
            }
        }

        // 청소할 칸 없는 경우
        int bd = (d + 2) % 4;
        int bx = r + dx[bd];
        int by = c + dy[bd];

        if (bx >= 0 && bx < N && by >= 0 && by < M && arr[bx][by] != 1){
            DFS(bx, by, d);
        }
    }

    public void q14503() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        st = new StringTokenizer(br.readLine(), " ");

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        DFS(r, c, d);

        System.out.println(answer);
    }
}