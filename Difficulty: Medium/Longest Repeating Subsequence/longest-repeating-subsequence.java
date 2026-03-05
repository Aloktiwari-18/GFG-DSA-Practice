class Solution {

    public int solve(int i, int j, String s, int[][] dp){

        if(i < 0 || j < 0){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s.charAt(i) == s.charAt(j) && i != j){
            dp[i][j] = 1 + solve(i-1, j-1, s, dp);
        }
        else{
            dp[i][j] = Math.max(
                solve(i-1, j, s, dp),
                solve(i, j-1, s, dp)
            );
        }

        return dp[i][j];
    }

    public int LongestRepeatingSubsequence(String s) {

        int n = s.length();
        int[][] dp = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }

        return solve(n-1, n-1, s, dp);
    }
}