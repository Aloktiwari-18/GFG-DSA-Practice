class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=  arr.length;
        int maxSum=arr[0];
        int ans=arr[0];
        for(int i=1;i<n;i++){
            maxSum= Math.max(maxSum+arr[i],arr[i]);
            
            ans= Math.max(ans, maxSum);
        }
        return ans;
    }
}
