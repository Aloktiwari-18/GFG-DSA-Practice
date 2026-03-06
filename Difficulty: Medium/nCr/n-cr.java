class Solution {
    public static int calculate(int n, int r, int [][]dp){
        if(r==0 || r==n){
            return 1;
        }
        if(dp[n][r]!=-1) return dp[n][r];
        
        int l= calculate(n-1, r-1, dp);
        int m=calculate(n-1, r, dp);
        return dp[n][r]=l+m;
    }
    public int nCr(int n, int r) {
        // code here
        if(r>n) return 0;

        int dp[][]= new int [n+1][r+1];
        for(int [] row:dp){
            Arrays.fill(row, -1);
            
        }
        return calculate(n, r, dp);

    }
}