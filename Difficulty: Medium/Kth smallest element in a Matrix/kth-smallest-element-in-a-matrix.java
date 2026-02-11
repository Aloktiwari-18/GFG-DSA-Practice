class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        int ans=0;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int []row:mat){
            for(int val:row){
                pq.add(val);
            }
        }
        for(int i=0;i<k;i++){
            ans=pq.poll();
            
            
        }
        return ans;
        
    }
}
