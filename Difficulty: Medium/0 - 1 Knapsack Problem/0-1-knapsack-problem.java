class Solution {
    public static int calculate(int i, int W, int [] val,int []wt,int [][]dp ){
       if(i==wt.length) return 0;
        if(dp[i][W]!=-1){
            return dp[i][W];

        }
        int skip= calculate(i+1, W, val, wt, dp);
        if(wt[i]>W){
            return dp[i][W]= skip;
        }
        int take= val[i]+calculate(i+1, W-wt[i], val, wt, dp);
        return dp[i][W]=Math.max(take, skip);
        
    }
    public int knapsack(int W, int val[], int wt[]) {
        int n= wt.length;

        // code here
        int dp[][]= new int [n][W+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<W+1;j++){
                dp[i][j]= -1;
            }
        }
        return calculate(0,W, val, wt, dp );
        
    }
}
