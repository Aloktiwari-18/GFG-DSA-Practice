class Solution {
    public static boolean solve(int idx, int arr[], int target, int [][]dp){
        if(idx==arr.length){
            return target==0;
        }
        if(dp[idx][target]!=-1){
            return dp[idx][target]==1;
        }
        boolean skip= solve(idx+1, arr, target, dp);
        boolean take=false;
        if(target-arr[idx]>=0){
            take= solve(idx+1, arr, target-arr[idx], dp);
        }
        boolean ans= take || skip;
          dp[idx][target] =ans ?1:0;
          return ans;
    }
    static boolean equalPartition(int arr[]) {
        // code here
        int sum=0;
        for(int ele: arr){
            sum+=ele;
        }
        if(sum%2!=0){
            return false;
        }
        
        
        int target= sum/2;
        int dp[][]= new int[arr.length][target+1];
        for(int e[]:  dp){
            Arrays.fill(e, -1);
        }
        return solve(0, arr, target, dp);
    }
}