import java.util.*;

class Solution {
    
    static int solve(int i, int[] arr, int[] dp){
        
        if(dp[i] != -1) return dp[i];
        
        int max = 1;
        
        for(int j = 0; j < i; j++){
            
            if(Math.abs(arr[i] - arr[j]) == 1){
                max = Math.max(max, 1 + solve(j, arr, dp));
            }
        }
        
        return dp[i] = max;
    }
    
    public static int longestSubseq(int[] arr) {
        
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        
        int ans = 1;
        
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, solve(i, arr, dp));
        }
        
        return ans;
    }
}