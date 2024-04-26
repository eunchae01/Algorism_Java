import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if (order.equals("push_front")){
                int X = Integer.parseInt(st.nextToken());

                deque.addFirst(X);
            }else if (order.equals("push_back")){
                int X = Integer.parseInt(st.nextToken());

                deque.addLast(X);
            }else if (order.equals("pop_front")){
                if (deque.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(deque.pollFirst());
                }
            }else if (order.equals("pop_back")){
                if (deque.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(deque.pollLast());
                }
            }else if (order.equals("size")){
                System.out.println(deque.size());
            }else if (order.equals("empty")){
                if (deque.isEmpty()){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            }else if (order.equals("front")){
                if (deque.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(deque.getFirst());
                }
            }else {
                if (deque.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(deque.getLast());
                }
            }
        }
    }
}
