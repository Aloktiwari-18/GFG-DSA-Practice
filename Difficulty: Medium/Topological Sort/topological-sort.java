class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        Queue<Integer> q= new LinkedList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        int [] indegree= new int[V];
        
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int [] e:edges){
            adj.get(e[0]).add(e[1]);
        }
        
        
        for(int i=0;i<V;i++){
            for(int next:adj.get(i)){
                indegree[next]++;
            }
        }
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        while(!q.isEmpty()){
            int top= q.poll();
            ans.add(top);
            
            for(int next:adj.get(top)){
                indegree[next]--;
                if(indegree[next]==0){
                    q.add(next);
                }
                
            }
            
            
        }
        return ans;
        
        
        
        
    }
}