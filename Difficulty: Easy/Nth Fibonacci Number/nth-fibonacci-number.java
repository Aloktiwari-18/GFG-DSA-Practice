class Solution {
    static int [] dp;
    public int fibo(int n){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans= fibo(n-1)+fibo(n-2);
        return ans;
        
    }
    public int nthFibonacci(int n) {
        // code here
        dp=new int [n+1];
        return fibo(n);
    }
}