import java.util.*;

public class Solution {
    static int count = 0, answer;
    static int[] card;
    static int[] check;

    public static int DFS(int groupNum, int index){
        if (count == card.length){
            answer =  findMax();
        }else {
            for (int i = index; i < card.length; i++) {
                if (check[index] == 0) {
                    check[index] = groupNum + 1;

                    int tmp = card[index];
                    count++;
                    DFS(groupNum, tmp - 1);
                }else {
                    for (int j = 0; j < check.length; j++) {
                        if (check[j] == 0){
                            DFS(groupNum + 1, j);
                        }
                    }
                }
            }
        }

        return 0;
    }

    static class getValue implements Comparable<getValue>{
        int key, value;

        getValue(int key, int value){
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(getValue o) {
            return o.value;
        }
    }

    public static int findMax(){
        PriorityQueue<getValue> q = new PriorityQueue<>(Collections.reverseOrder());

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a :
                check) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int[] arr = new int[map.size()];

        if (arr.length == 1){
            return 0;
        }else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = map.get(i + 1);
            }
        }

        Arrays.sort(arr);

        return arr[arr.length - 1] * arr[arr.length - 2];
    }

    public static int solution(int[] cards) {
        card = cards;
        check = new int[cards.length];

        DFS(0, 0);

        System.out.println(answer);

        return answer;
    }

}
