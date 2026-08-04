class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        
        int left=0;
        List<Integer> ans= new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        for(int right=0;right<arr.length;right++){
            if(arr[right]<0){
                q.add(right);
                
            }
            if(right-left+1==k){
               while(!q.isEmpty() && q.peek()<left){
                   q.poll();
               }
               if(q.size()==0){
                   ans.add(0);
               }else{
                   ans.add(arr[q.peek()]);
               }
               left++;
           
            }
            
            
            
            
            
        }
        return ans;
    }
}