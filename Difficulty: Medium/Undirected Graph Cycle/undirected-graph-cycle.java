class Pair{
    int node;
    int parent;
    Pair(int node, int parent){
        this.node=node;
        this.parent=parent;
    }
}

class Solution {
    
    public boolean dfs(int node, int V,  ArrayList<ArrayList<Integer>> adj, boolean [] vis){
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(node,-1));
        vis[node]=true;
        while(!q.isEmpty()){
            int nd= q.peek().node;
            int par= q.peek().parent;
            q.poll();
            
            for(int it: adj.get(nd)){
                if(!vis[it]){
                    vis[it]=true;
                    q.add(new Pair(it, nd));
                    
                }
                else if(it!=par){
                    return true;
                }
                
                
                
            }
            
        }
        return false;
        
    }
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u= edges[i][0];
            int v=edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
            
        }
        // Code here
        boolean vis[]= new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(i, V,adj,vis)){
                    return true;
                }
            }
        }
        return false;
    }
}