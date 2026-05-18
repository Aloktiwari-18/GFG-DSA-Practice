class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        
        int maxSum=arr[0];
        int ans= arr[0];
        for(int i=1;i<arr.length;i++){
            maxSum= Math.max(maxSum+arr[i], arr[i]);
            ans= Math.max(maxSum,ans);
        }
        return ans;
    }
}
