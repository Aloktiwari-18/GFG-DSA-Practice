class Solution {
    
    public int solve(int arr[],  int idx, int sum, int [][] dp, int target, int maxSum){
        if(idx==arr.length){
            return sum==target ? 1:0;
        }
        if(dp[idx][sum+maxSum]!=-1){
            return dp[idx][sum+maxSum];
        }
        int add= solve(arr, idx+1, sum+arr[idx], dp, target, maxSum);
        int sub= solve(arr, idx+1, sum-arr[idx], dp, target, maxSum);
        
        return dp[idx][sum+maxSum]=add+sub;
        
    }
    public int totalWays(int[] arr, int target) {
        // code here
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            maxSum+=arr[i];
        }
        
        int dp[][]= new int[arr.length][2*maxSum+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        return solve(arr, 0, 0, dp,  target, maxSum);
         
        
    }
}