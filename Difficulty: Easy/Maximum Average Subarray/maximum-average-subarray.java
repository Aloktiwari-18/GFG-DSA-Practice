class Solution {
    public int findMaxAverage(List<Integer> arr, int k) {
        int  n= arr.size();;
        int ans=-1;
        double max=Integer.MIN_VALUE;
        int left=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr.get(i);
            if((i-left+1)==k){
                double avg=(double)sum/k;
                if(avg>max){
                    
                    max=avg;
                    ans=left;
                }
                sum=sum-arr.get(left);
                
                left++;
            }
            
        }
        return ans;
       
        
    }
}