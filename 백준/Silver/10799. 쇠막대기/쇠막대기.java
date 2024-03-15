import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                stack.push("(");
            }else {
                stack.pop();

                if (str.charAt(i - 1) == '('){
                    answer += stack.size();
                }else {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}