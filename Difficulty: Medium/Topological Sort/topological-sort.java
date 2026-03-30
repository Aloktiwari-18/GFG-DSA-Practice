class Solution {
    public static void dfs(int node , int [] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        
        vis[node]=1;
        for(int it: adj.get(node)){
            if(vis[it]==0){
                dfs(it, vis, adj, st);
                
            }
            
        }
        st.push(node);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        for(int [] edge: edges){
            adj.get(edge[0]).add(edge[1]);
        }

        // code here
        int vis[]= new int [V];
        Stack<Integer> st= new Stack<>();
        
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i, vis, adj, st);
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }
}