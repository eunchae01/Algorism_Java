import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = st.countTokens();

        int[] room = new int[num];

        for (int i = 0; i < room.length; i++) {
            room[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long answer = 0;

        for(int i = 0; i < room.length; i++){
            room[i] -= B;
            answer++;

            while (room[i] > 0){
                if (room[i] >= C){
                    answer += room[i] / C;
                    room[i] %= C;
                }else {
                    answer++;
                    room[i] = 0;
                }
            }

        }

        System.out.println(answer);
    }
}
