class Solution {
    public int solver(int arr[], int n, int dp[]){
        if(n==0){
            return 0;
        }
        if(n==1){
            return arr[0];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick= arr[n-1]+ solver(arr, n-2, dp);
        int skip= solver(arr,n-1, dp);
        dp[n]= Math.max(pick, skip);
        return dp[n];
    }
    public int findMaxSum(int arr[]) {
        int n= arr.length;
        // code here
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        return solver(arr, n,dp);
        
    }
}