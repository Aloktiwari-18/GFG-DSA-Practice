class Solution {
    public static int calculate(int i, int j, StringBuilder sb1, StringBuilder sb2, int dp[][]){
         if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(sb1.charAt(i)== sb2.charAt(j)){
            dp[i][j]=1+calculate(i-1, j-1, sb1, sb2, dp);
        }else{
            dp[i][j]=0;
        }
        return dp[i][j];
    }
    public int longCommSubstr(String s1, String s2) {
        // code here
        
        StringBuilder sb1= new StringBuilder (s1);
        StringBuilder sb2= new StringBuilder (s2);
        int n= sb1.length();
        int m= sb2.length();
        int dp[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
                
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans= Math.max(ans,calculate( i, j, sb1, sb2, dp));
            }
        }
        return  ans;
    }
}