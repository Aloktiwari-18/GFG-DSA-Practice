// User function Template for Java

class Solution { 
    public static int calculate(int i, int j, int []arr, int k, int dp[][]){
        if(i>j) return Integer.MAX_VALUE;
        if(arr[j]-arr[i]<=k) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int remMin= 1+calculate(i+1, j, arr, k, dp);
        int remMax= 1+calculate(i, j-1, arr, k, dp);
        return dp[i][j]=Math.min(remMin, remMax);
    }
    int removals(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int dp[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return calculate (0, n-1,  arr, k, dp);
    }
}