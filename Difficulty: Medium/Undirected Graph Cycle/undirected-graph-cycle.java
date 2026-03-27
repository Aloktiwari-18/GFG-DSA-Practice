class Solution {
    public static boolean dfs(int node ,int parent,  ArrayList<ArrayList<Integer>> adj, int [] vis){
        vis[node]= 1;
        
        for(int it:adj.get(node)){
            if(vis[it]==0){
                if(dfs(it, node, adj , vis )){
                    return true;
                }
                
            }
            else if(it!=parent){
                return true;
            }
        }
        // pathVis[node]= 0;
        return false;
        
    }
    public boolean isCycle(int V, int[][] edges) { // Code here
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        int [] vis= new int[V];
        // int pathVis[]= new int[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        } 
            for(int [] edge: edges){
                adj.get(edge[0]).add(edge[1]);
                adj.get(edge[1]).add(edge[0]);
            }
            
            for(int i=0;i<V;i++){
                if(vis[i]==0){
                    if(dfs(i,-1, adj, vis)){
                        return true;
                    }
                    
                }
            
            
        }
        return false;
    }
}