class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        int indegree[]= new int[V];
        
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        for(int i=0;i<edges.length;i++){
            int a= edges[i][0];
            int b=edges[i][1];
            
            adj.get(a).add(b);
        }
        for(int i=0;i<V;i++){
            for(int next: adj.get(i)){
                indegree[next]++;
            }
        }
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        return ans;
    }
}