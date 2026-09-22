class Solution {
    public void dfs(int node,boolean [] vis,  ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans ){
        vis[node]=true;
        ans.add(node);
        for(int it:adj.get(node)){
            if(!vis[it]){
                dfs(it, vis,adj, ans);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        boolean vis[]= new boolean[adj.size()];
        ArrayList<Integer> ans= new ArrayList<>();
        dfs(0,vis, adj, ans);
        return ans;
    }
}