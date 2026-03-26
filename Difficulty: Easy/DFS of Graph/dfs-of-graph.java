class Solution {
    public static void depth(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> ans){
        vis[node]= true;
        for(int it:adj.get(node)){
            if(vis[it]==false){
                ans.add(it);
                vis[it]= true;
                depth(it, adj, vis, ans);
            }
        }
        
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V= adj.size();
        boolean [] vis= new boolean[V+1];
        
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(0);
        depth(0, adj, vis, ans);
        return ans;
       
        
    }
}