import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String[] arr = new String[T];
        String answer = "";

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            answer = "YES";

            Stack<Character> stack = new Stack<Character>();

            for (char vps :
                    str.toCharArray()) {
                if (vps == ')'){
                    if (stack.isEmpty()){
                        answer = "NO";
                    }else if(stack.peek() == '('){
                        stack.pop();
                    }else {
                        stack.add(vps);
                    }
                }else {
                    stack.add(vps);
                }
            }

            if (!stack.isEmpty()){
                answer = "NO";
            }

            System.out.println(answer);
        }     
    }
}