// User function Template for Java

class Solution {
    public int isNegativeWeightCycle(int n, int[][] edges) {
        // code here

        int dist[]= new int[n];
        for(int i=0;i<n;i++){
            dist[i]=(int)(1e8);
        }
        dist[0]=0;
        for(int i=0;i<n-1;i++){
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];
                
                if ( dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }
        for(int [] edge: edges){
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];
                if (dist[u] + wt < dist[v]){
                    return 1;
                }
                
                
            
        }
        return 0;
        
        
        

        
    }
}