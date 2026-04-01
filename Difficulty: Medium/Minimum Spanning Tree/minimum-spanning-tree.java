class Pair{
    int distance;
    int node;
    
    Pair(int distance, int node){
        this.distance= distance;
        this.node= node;
        
    }
}

class Solution {
    
    public int spanningTree(int V, int[][] edges) {
        // code here
        int vis[]= new int [V];
        ArrayList<ArrayList<Pair>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        for(int i=0;i<edges.length;i++){
            int u= edges[i][0];
            int v= edges[i][1];
            int w= edges[i][2];
            
            adj.get(u).add(new Pair(w,v));
            adj.get(v).add(new Pair(w,u));
        }
        PriorityQueue<Pair> pq= new PriorityQueue<>( (x,y) ->x.distance- y.distance);
        pq.add(new Pair(0,0));
        int sum=0;
        while(!pq.isEmpty()){
            Pair curr= pq.poll();
            int wt= curr.distance;
            int node= curr.node;
            
            
            if(vis[node]==1){
                
               continue;
            }
            vis[node]=1;
            sum+=wt;
            for(Pair neighbor : adj.get(node)){
                int adjWt= neighbor.distance;
                int adjNode= neighbor.node;
                
                
                if(vis[adjNode]==0){
                    pq.add(new Pair(adjWt,adjNode));
                }
            }
        }
        return sum;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
