class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n= arr.length;
        int maxEnd=arr[0];
        int res=arr[0];
        
        for(int i=1;i<n;i++){
            maxEnd=Math.max(arr[i]+maxEnd,arr[i]);
            res=Math.max(res, maxEnd);
            
        }
        return res;
    }
}
