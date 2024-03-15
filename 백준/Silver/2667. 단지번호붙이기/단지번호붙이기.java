import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Q2667 q2667 = new Q2667();
        q2667.q2667();
    }
}

class Q2667{
    int N;
    int danji = 0, area;
    int[][] map;

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    public void DFS(int x, int y){
        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] == 1){
                area++;

                map[nx][ny] = -1;

                DFS(nx, ny);
            }
        }
    }

    public void q2667() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] home = br.readLine().split("");

            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(home[j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1){
                    danji++;
                    area = 1;

                    map[i][j] = -1;

                    DFS(i, j);

                    list.add(area);
                }
            }
        }

        Collections.sort(list);

        System.out.println(danji);

        for (int a :
                list) {
            System.out.println(a);
        }
    }
}