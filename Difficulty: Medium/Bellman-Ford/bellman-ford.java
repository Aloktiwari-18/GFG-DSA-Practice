// User function Template for Java
import java.util.Arrays;
class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
     
        int [] dist= new int[V];
        Arrays.fill(dist,(int)(1e8));
        dist[src]=0;
        
        
       for(int i=0;i<V;i++){
           for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int wt = e[2];
            if(dist[u]!=(int)(1e8) && dist[u]+wt<dist[v]){
                if(i==V-1){
                    return new int[]{-1};
                }
                dist[v]=dist[u]+wt;
                
            }
            
        
            
        }
           
       } 
       return dist;
        
       
      
        
    }
}
