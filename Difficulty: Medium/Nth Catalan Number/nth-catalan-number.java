
class Solution {
    public static int findCatalan(int n) {
        if(n<=1) return 1;
        if(n==2) return 2;
        // code here
        long dp[]= new long [n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return (int)dp[n];
    }
}
