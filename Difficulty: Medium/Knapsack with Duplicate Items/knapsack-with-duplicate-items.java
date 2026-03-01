class Solution {
    public int profit(int i, int [] val, int [] wt, int C, int [][] dp){
        if(i==wt.length){
            return 0;
        }
        if(dp[i][C]!=-1){
            return dp[i][C];
        }
        int skip= profit(i+1, val, wt, C, dp);
        if(wt[i]>C) return dp[i][C]=skip;
        int take=val[i]+profit(i,val, wt, C-wt[i], dp);
        return dp[i][C]= Math.max(skip, take);
    }
    public int knapSack(int val[], int wt[], int C) {
       int N= wt.length;
       int dp[][]= new int[N][C+1];
       for(int i=0;i<N;i++){
           for(int j=0;j<dp[0].length;j++){
               dp[i][j]= -1;
           }
       }
       return profit(0, val, wt, C, dp);
       
        
    }
}