class Solution {
    public static int count(int i, int [] arr, int []dp){
        
        if(dp[i]!=-1) return dp[i];
        int max_count=1;
        for(int j=0;j<i;j++){
            
            if(arr[i]>arr[j]){
                max_count=Math.max(max_count,1+count(j, arr,dp));
            }
        }
        return dp[i]=max_count;
    }
    static int lis(int arr[]) {
        int n=arr.length;
        int dp[]= new int[n];
        
        for(int i=0;i<n;i++){
            dp[i]=-1;
            
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans= Math.max(ans, count(i,arr, dp));
        }
        return ans;
        
    }
}