class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int maxSum=Integer.MIN_VALUE;
        int ws=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            ws+=arr[i];
            
            
        }
        int s=0;
        int e=k;
        maxSum=ws;
        while(k<n){
            ws=ws-arr[s]+arr[k];
            maxSum=Math.max(maxSum,ws);
            s++;
            k++;
        }
        return maxSum;
        
    }
}