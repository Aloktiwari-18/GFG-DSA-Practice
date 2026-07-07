class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        
        while(right<n){
            sum+=arr[right];
            if(right-left+1==k){
                max=Math.max(sum, max);
                sum=sum-arr[left];
                left++;
            }
            right++;
        }
        return max;
       
        
    }
}