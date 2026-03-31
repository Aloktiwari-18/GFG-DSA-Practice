class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        // code here
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            
        }
        
        
        int indegree[]=new int [n];
        for(int i=0;i<prerequisites.length;i++){
            int u= prerequisites[i][0];
            int v= prerequisites[i][1];
            
            adj.get(u).add(v);
            
            indegree[v]++;
        }
        Queue<Integer> q= new LinkedList<>();
        
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int num= q.poll();
            count++;
            
            for(int it: adj.get(num)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
            
            
        }
        return count==n;
        
        
    }
}