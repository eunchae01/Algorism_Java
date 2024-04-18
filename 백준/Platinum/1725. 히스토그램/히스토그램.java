import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N =  Integer.parseInt(br.readLine());
        arr = new int[N + 2];

        for(int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        int answer =0;

        for(int i = 1; i < N + 2; i++) {
            while(!stack.isEmpty()) {
                int top = stack.peek();

                if(arr[top] <= arr[i]) {
                    break;
                }

                stack.pop();

                // 더 큰 값으로 저장
                answer = Math.max(answer, arr[top] * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        System.out.println(answer);
    }
}
