import java.util.*;

class Edge implements Comparable<Edge>{
    public int vex, cost;

    Edge(int vex, int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge ob){
        return this.cost - ob.cost;
    }
}

class Solution {
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    public void dijkstra(int v){
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        
        pQ.offer(new Edge(v, 0));
        dis[v] = 0;
        
        while(!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            
            int now = tmp.vex;
            int nowCost = tmp.cost;
            
            if(nowCost > dis[now]){
                continue;
            }
            
            for(Edge ob : graph.get(now)){
                if(dis[ob.vex] > nowCost + ob.cost){
                    dis[ob.vex] = nowCost + ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
                }
            }
        }
    }
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        graph = new ArrayList<ArrayList<Edge>>();
        
        for(int i = 0; i < N + 1; i++){
            graph.add(new ArrayList<Edge>());
            
        }
        
        dis = new int[N + 1];
        
        Arrays.fill(dis, Integer.MAX_VALUE);
        
        for(int i = 0 ; i < road.length; i++){
            graph.get(road[i][0]).add(new Edge(road[i][1], road[i][2]));
            graph.get(road[i][1]).add(new Edge(road[i][0], road[i][2]));
        }
        
        dijkstra(1);
        
        for(int i = 1; i < dis.length; i ++){
            if(dis[i] <= K){
                answer++;
            }
        }

        return answer;
    }
}