// User function Template for Java

class Solution {
    public static int count(int i, int currProd, int arr[], int k, int [][] dp){
        if(i==arr.length){
            return (currProd<=k) ?1:0;
        };
        if(dp[i][k]!=-1){
            return dp[i][k];
            
        }
        int skip= count(i+1, currProd, arr, k, dp);
        int take = 0;
        if(currProd*arr[i]<=k){
            take=count(i+1, currProd*arr[i] , arr, k, dp);
        }
        // dp[i][k]= take +skip;
        // return dp[i][k];
        return take +skip;
        
        
    }
    public int numOfSubsets(int[] arr, int k) {
        // code here
        int n= arr.length;
        int dp[][]= new int [n][k+1];
        for(int ele[] : dp){
            Arrays.fill(ele,-1);
        }
        
        return count(0 , 1 , arr,k, dp)-1;
        
    }
};