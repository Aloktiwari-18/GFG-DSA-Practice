// User function Template for Java

class Solution {
    public static int calculate(int i, int j, StringBuilder sb, int [][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
            
        }
        if(sb.charAt(i)==sb.charAt(j) && i!=j){
            dp[i][j]=1+calculate(i-1, j-1, sb, dp);
        }else{
            dp[i][j]=Math.max(calculate(i-1,j,sb, dp), calculate(i, j-1, sb,dp));
        }
        return dp[i][j];
    } 
    public int LongestRepeatingSubsequence(String s) {
        // code here
        StringBuilder sb= new StringBuilder (s);
        int n= sb.length();
        int dp[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return calculate(n-1, n-1, sb, dp);
    }
}