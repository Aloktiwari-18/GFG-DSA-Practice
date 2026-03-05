class Solution {
    public int sequence(int i, int j, StringBuilder sb1, StringBuilder sb2, int dp[][]){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(sb1.charAt(i)==sb2.charAt(j)){
             dp[i][j]=1+sequence(i-1, j-1, sb1, sb2, dp);
        }else{
             dp[i][j]=Math.max(sequence(i-1, j, sb1, sb2,dp), sequence(i,j-1,sb1, sb2, dp));
        }
        return dp[i][j];
    }
    static int lcs(String s1, String s2) {
        StringBuilder sb1= new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        
        int m= sb1.length();
        int n= sb2.length();
        
        int dp[][]= new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]= -1;
            }
        }
        Solution obj= new Solution();
        return  obj.sequence(m-1, n-1, sb1, sb2, dp);
    }
}