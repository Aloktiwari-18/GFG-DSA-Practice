class Solution {
    public int solve(int idx, int [] coins, int sum, int[][]dp){
        if(sum<0  || idx>=coins.length){
            return (int)(1e9);
        }
        if(sum==0){
            return 0;
        }
        if(dp[idx][sum]!=-1){
            return dp[idx][sum];
        }
        int take= 1+solve(idx, coins, sum-coins[idx], dp);
        int skip= solve(idx+1,coins, sum, dp);
        return dp[idx][sum]=Math.min(take, skip);
    }
    public int minCoins(int coins[], int sum) {
        // code here]
        int dp[][]= new int[coins.length][sum+1];
        for(int [] e: dp){
            Arrays.fill(e,-1);
        }
        int ans= solve(0,coins, sum, dp);
        if(ans>=(int)(1e9)){
            return -1;
        }
        return ans;
    }
}