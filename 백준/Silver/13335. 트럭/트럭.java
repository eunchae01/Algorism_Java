import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            q.offer(Integer.parseInt(st.nextToken()));
        }

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < w; i++) {
            bridge.offer(0);
        }

        int bridgeWeight = 0, time = 0;

        while (!q.isEmpty()){
            if (q.peek() + bridgeWeight - bridge.peek() <= L){  // 다음에 올라올 트럭 무게 + 현재 다리위 트럭 무게 확인 후 버틸 수 있으면
                time++;                         // 시간 1초 증가
                bridgeWeight -= bridge.poll();  // 다리 위 맨 앞 트럭 무게 빼주고
                bridge.offer(q.peek());         // q에서(대기중 트럭) 다리 위로 이동
                bridgeWeight += q.poll();       // 다리 위 무게에 더해줌
            }else {
                time++;
                bridgeWeight -= bridge.poll();
                bridge.offer(0);
            }
        }

        int maxIndex = 0;

        for (int i = 0; i < w; i++) {
            if (bridge.poll() != 0){
                maxIndex = i + 1;
            }
        }

        System.out.println(time + maxIndex);
    }
}