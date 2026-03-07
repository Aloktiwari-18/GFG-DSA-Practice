class Solution {

    public static int calculate(int i, int j, int[][] mat, int[][] dp){

        if(i < 0 || i >= mat.length || j >= mat[0].length){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int right = calculate(i, j+1, mat, dp);
        int rightUp = calculate(i-1, j+1, mat, dp);
        int rightDown = calculate(i+1, j+1, mat, dp);

        dp[i][j] = mat[i][j] + Math.max(right, Math.max(rightUp, rightDown));

        return dp[i][j];
    }

    public int maxGold(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[][] dp = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }

        int maxGold = 0;

        for(int i=0;i<m;i++){
            maxGold = Math.max(maxGold, calculate(i,0,mat,dp));
        }

        return maxGold;
    }
}