class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        boolean vis[]= new boolean[adj.size()];
        Queue<Integer> q= new LinkedList<>();
        
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int a= q.poll();
            ans.add(a);
            
            for(int it: adj.get(a)){
                if(vis[it]){
                    continue;
                }
                vis[it]=true;
                q.add(it);
            }
        }
        return ans;
    }
}