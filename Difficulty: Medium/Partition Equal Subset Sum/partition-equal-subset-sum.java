class Solution {
   
    public boolean isSame(int i, int [] arr, int sum, int [][]dp){

        if(i == arr.length){
            return sum == 0;
        }

        if(dp[i][sum] != -1){
            return dp[i][sum] == 1;
        }

        boolean skip = isSame(i+1, arr, sum, dp);

        boolean take = false;
        if(sum - arr[i] >= 0){
            take = isSame(i+1, arr, sum-arr[i], dp);
        }

        boolean ans = skip || take;

        dp[i][sum] = ans ? 1 : 0;

        return ans;
    }

    static boolean equalPartition(int arr[]) {

        int sum = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            sum += arr[i];
        }

        if(sum % 2 != 0){
            return false;
        }

        int target = sum / 2;

        int dp[][] = new int[n][target+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<=target;j++){
                dp[i][j] = -1;
            }
        }

        Solution obj = new Solution();
        return obj.isSame(0, arr, target, dp);
    }
}