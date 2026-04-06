class Solution {
    static int max;
    public static int dfs(int i, int []arr, int []dp){
        int n= arr.length;
        
        if(dp[i]!=-1){
            return dp[i];
        }
        int sum=arr[i];
        for(int prev=0;prev<i;prev++){
        
            if(arr[prev]<arr[i]){
                sum=Math.max(sum, arr[i]+dfs(prev, arr, dp));
            }
            
        }
        return dp[i]=sum;
        

    }
    public int maxSumIS(int arr[]) {
        // code here
        max=0;
        int n= arr.length;
        int dp[]= new int [n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        for(int i=0;i<n;i++){
            max= Math.max(max, dfs(i, arr, dp));
            
        }
        return max;
    }
}