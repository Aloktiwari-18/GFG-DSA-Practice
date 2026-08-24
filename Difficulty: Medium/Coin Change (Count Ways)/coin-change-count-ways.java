class Solution {
    
    public int solve(int [] coins, int idx, int sum, int target, int dp[][]){
        if(sum==target){
            return 1;
        }
        
        
        if(idx==coins.length || sum>target){
            return 0;
        }
        if(dp[idx][sum]!=-1){
            return dp[idx][sum];
        }
        return dp[idx][sum]=solve(coins, idx+1, sum, target, dp )+ solve(coins, idx, sum+coins[idx], target , dp);
        
    }
    public int count(int coins[], int target) {
        
        int[][] dp = new int[coins.length][target + 1];
            
        for(int []row: dp){
            Arrays.fill(row, -1);
        }
        // code here.
        return solve(coins, 0,  0, target, dp);
    }
}