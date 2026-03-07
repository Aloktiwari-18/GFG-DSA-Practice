// User function Template for Java

class Solution {
    public static int calculate(int i, int x, int y, int z, int[]dp){
        if(i==0){
            return 0;
        }
        if(i<0) {
            return Integer.MIN_VALUE;
        }
        if(dp[i]!=-1) return dp[i];
        
        
        int tx= 1+calculate(i-x,x,y,z,dp);
        int ty= 1+calculate(i-y,x,y,z,dp);
        int tz= 1+calculate(i-z,x,y,z,dp);
        
        return dp[i]= Math.max(tx,Math.max(ty,tz));
        
    }
    // Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z) {
        
        // Your code here\
    int dp[]= new int [n+1];
    for(int i=0;i<=n;i++){
        dp[i]=-1;
    }
    int ans= calculate(n, x, y, z, dp);
    return ans<0 ? 0 : ans;

    }
}
