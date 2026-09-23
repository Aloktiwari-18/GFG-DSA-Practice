class Solution {
    public int solve(int idx, int W, int val[], int wt[], int [][]dp){
        if(idx==wt.length){
            return 0;
        }
        if(dp[idx][W]!=-1){
            return dp[idx][W];
        }
        int skip= solve(idx+1, W,val, wt, dp);
       
        int take = 0;
                if (W >= wt[idx]) {
                    take = val[idx] + solve(idx + 1, W - wt[idx], val, wt, dp);
                }
        
         
        return dp[idx][W]=Math.max(take, skip);
    }
    public int knapsack(int W, int val[], int wt[]) {
        int dp[][]= new int[wt.length][W+1];
        for(int []e:dp){
            Arrays.fill(e, -1);
        }
        // code here
        return solve(0, W, val, wt, dp);
    }
}
