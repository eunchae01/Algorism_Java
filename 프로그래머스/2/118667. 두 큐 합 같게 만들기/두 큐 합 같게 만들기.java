import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long q1Sum = 0, q2Sum = 0;

        for (int i = 0; i < queue1.length; i++) {

            q1.offer(queue1[i]);
            q1Sum += queue1[i];

            q2.offer(queue2[i]);
            q2Sum += queue2[i];
        }

        long half = (q1Sum + q2Sum) / 2;

        int peek;

        while (q1Sum != half && q2Sum != half){
            if (answer == (queue1.length + queue2.length) * 2){
                return -1;
            }

            if (q1Sum > q2Sum){
                peek = q1.peek();

                q2.offer(peek);
                q1.poll();

                q1Sum -= peek;
                q2Sum += peek;
            }else {
                peek = q2.peek();

                q1.offer(peek);
                q2.poll();

                q1Sum += peek;
                q2Sum -= peek;
            }
            answer++;
        }

        return answer;
    }
}