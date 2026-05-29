class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxSum=0;
        int window_sum=0;
        for(int i=0;i<k;i++){
            maxSum+=arr[i];
        }
        window_sum= maxSum;
        int s=0;
        int e=k;
        while(k<arr.length){
            window_sum= window_sum- arr[s]+arr[k];
            maxSum= Math.max(window_sum, maxSum);
            s++;
            k++;
        }
        return maxSum;
        
    }
}