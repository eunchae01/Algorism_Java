import java.util.*;

class Solution {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    
    static class Edge{
        int x, y;
        
        Edge(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public int solution(int[][] maps) {
        int answer = -1;
        
        Queue<Edge> q = new LinkedList<>();
        q.offer(new Edge(0, 0));
        
        while(!q.isEmpty()){
            Edge tmp = q.poll();
            
            for(int i = 0; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                
                if(nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length && maps[nx][ny] == 1){
                    maps[nx][ny] = maps[tmp.x][tmp.y] + 1;
                    
                    q.offer(new Edge(nx, ny));
                }
            }
        }
        
        if(maps[maps.length - 1][maps[0].length - 1] != 1){
            answer = maps[maps.length - 1][maps[0].length - 1];
        }
        
        return answer;
    }
}