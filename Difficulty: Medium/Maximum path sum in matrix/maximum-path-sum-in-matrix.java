// User function Template for Java
class Solution {
    public static int pathSum(int i, int j, int mat[][], int [][] dp){
        int n= mat.length;
        if(j<0 || j>=mat[0].length){
            return Integer.MIN_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==n-1) return mat[i][j];
        int pathDown= pathSum(i+1,j,mat, dp);
        int pathLeft= pathSum(i+1, j-1, mat, dp);
        
        int pathRight= pathSum(i+1,j+1, mat, dp);
        
       return dp[i][j] = mat[i][j]+Math.max(pathDown, Math.max(pathLeft, pathRight));
        
        
        
    }
    public int maximumPath(int[][] mat) {
        int n= mat.length;
        int m= mat[0].length;
        // code here
        int [][]dp =new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int j=0;j<m;j++){
            ans =Math.max(ans,pathSum(0, j, mat, dp));
        }
        return ans;
    }
}