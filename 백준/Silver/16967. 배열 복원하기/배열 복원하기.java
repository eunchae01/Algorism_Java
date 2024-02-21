import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Question q = new Question();

        q.q16967();
    }
}

class Question{
    public void q16967() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[][] arrB = new int[H + 1][W + 1];

        for (int i = 0; i < H + 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < W + 1; j++) {
                arrB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] arrA = new int[H][W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i - X < 0 || j - Y < 0){
                    arrA[i][j] = arrB[i][j];
                }else {
                    arrA[i][j] = arrB[i][j] - arrA[i - X][j - Y];
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();
        }
    }
}