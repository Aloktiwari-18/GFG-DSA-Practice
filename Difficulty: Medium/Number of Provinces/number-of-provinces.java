// User function Template for Java

class Solution {
     
    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node]= true;
        for(int j=0;j<adj.size();j++){
            if(adj.get(node).get(j)==1 && vis[j]==false){
                dfs(j, vis, adj);
                
            }
        }
        
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean vis[]= new boolean[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                count++;
                dfs(i,vis, adj);
            }
        }
        return count;

        

    }
}