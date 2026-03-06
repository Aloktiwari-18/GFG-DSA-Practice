class Solution {
    public static int maxSum(int i, int [] arr, int [] dp){
        if(dp[i]!=-1){
            return dp[i];
        }
        int sum=arr[i];
        for(int j=0;j<i;j++){
            
             if(arr[j]<arr[i]){
                sum=Math.max(sum, arr[i]+maxSum(j, arr,dp));
             }
        }
        return dp[i]=sum;
    }
    public int maxSumIS(int arr[]) {
        int n= arr.length;
        int dp[]=new int [n];
        
        for(int i=0;i<n;i++){
            dp[i]= -1;
        }
        int max_ans=0;
        for(int i=0;i<n;i++){
            max_ans= Math.max(max_ans,maxSum(i, arr, dp));
        }
        return max_ans;
    }
}