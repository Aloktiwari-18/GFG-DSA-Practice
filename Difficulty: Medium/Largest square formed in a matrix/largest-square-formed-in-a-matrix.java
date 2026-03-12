// User function Template for Java

class Solution {
    public static int calculate(int i, int j, int [][] mat, int [][]dp){
        if(i>=mat.length ||  j>=mat[0].length){
            return 0;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right= calculate(i,j+1, mat, dp);
        int down= calculate(i+1, j, mat, dp);
        int downdiag= calculate(i+1, j+1, mat, dp);
        
        
        if(mat[i][j]==1){
             dp[i][j]=1+Math.min(right, Math.min(downdiag, down));
            
        }else{
            dp[i][j]=0;
            
        }
        return dp[i][j];
         

    }
    static int maxSquare(int mat[][]) {
        // code here
        int n= mat.length;
        int m= mat[0].length;
        
        
        int[][] dp= new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
            
            
        }
        int ans=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans= Math.max(ans, calculate(i, j, mat, dp));
            }
            
            
        }
        return ans;
        
        
        
    }
}