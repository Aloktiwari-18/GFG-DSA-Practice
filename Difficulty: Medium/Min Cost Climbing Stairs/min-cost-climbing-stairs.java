//Back-end complete function Template for Java

class Solution {
   public static int solve(int [] cost, int idx, int []dp){
       if(idx==0 || idx==1){
           return cost[idx];
       }
       if(dp[idx]!=-1){
           return dp[idx];
       }
       return dp[idx]= cost[idx]+Math.min(solve(cost, idx-1, dp), solve(cost, idx-2, dp));
   }

    static int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int dp[]= new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
       return Math.min(solve(cost, n-1, dp), solve(cost,n-2, dp));
    }
}