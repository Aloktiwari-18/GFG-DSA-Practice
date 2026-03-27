class Solution {
    
    public static boolean detect(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] pathVis) {
        
        vis[node] = 1;
        pathVis[node] = 1;
        
        for(int it : adj.get(node)) {
            
            if(vis[it] == 0) {
                if(detect(it, adj, vis, pathVis)) {
                    return true;
                }
            }
            
            else if(pathVis[it] == 1) {
                return true;
            }
        }
        
        
        pathVis[node] = 0;
        return false;
    }
    
    public boolean isCyclic(int V, int[][] edges) {
        
        int[] vis = new int[V];
        int[] pathVis = new int[V];
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
        
        for(int i = 0; i < V; i++) {
            if(vis[i] == 0) {
                if(detect(i, adj, vis, pathVis)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}