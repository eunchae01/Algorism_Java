import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Question question = new Question();

        question.q17086();
    }
}

class Question{
    static class Point{
        private int x, y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int N, M;
    static int[][] arr, dis;
    static Queue<Point> q = new LinkedList<>();

    // 12시부터 시계방향
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

    public static void BFS(){
        while (!q.isEmpty()){
            // 현재위치
            Point tmp = q.poll();

            for (int i = 0; i < dx.length; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && arr[nx][ny] == 0 && dis[nx][ny] == 0){
                        q.offer(new Point(nx, ny));

                        dis[nx][ny] = dis[tmp.x][tmp.y] == Integer.MIN_VALUE ? 1 : dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public void q17086() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        dis = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                // 상어 있는 자리 저장
                if (arr[i][j] == 1){
                    q.offer(new Point(i, j));

                    dis[i][j] = Integer.MIN_VALUE;
                }
            }
        }

        BFS();

        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dis[i][j] > answer){
                    answer = dis[i][j];
                }
            }
        }

        System.out.println(answer);
    }
}



