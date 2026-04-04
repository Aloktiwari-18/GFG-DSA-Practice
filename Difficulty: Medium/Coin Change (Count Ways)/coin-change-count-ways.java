class Solution {
    public static int calculate(int coins[], int n, int sum, int [][]dp){
        if(sum==0) return 1;
        if(n==0 || sum< 0){
            return 0;
        }
        if(dp[n][sum]!=-1){
            return dp[n][sum];
        }
        return dp[n][sum]= calculate(coins, n-1, sum, dp)+
        calculate(coins, n, sum-coins[n-1],dp);

    }
    public int count(int coins[], int sum) {
        int n= coins.length;

        // code here.
        
        int dp[][]= new int [n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                dp[i][j]=-1;
            }
            
        }
        return calculate(coins, n, sum, dp);
    }
}