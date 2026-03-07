class Solution {
    public static int count(int i, int j, StringBuilder sb1, StringBuilder sb2, int [][] dp){
        if(i==-1) return j+1;
        if(j==-1) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        
        if(sb1.charAt(i)==sb2.charAt(j)){
            return dp[i][j]=count(i-1, j-1, sb1, sb2, dp);
        }else{
            int ins= count(i-1, j, sb1, sb2, dp);
            int rep= count(i-1, j-1, sb1, sb2, dp);
            int rem= count(i, j-1, sb1, sb2, dp);
            return dp[i][j]=1+Math.min(ins, Math.min(rep, rem));
            
        }
    }
    public int editDistance(String s1, String s2) {
        StringBuilder sb1= new StringBuilder (s1);
        StringBuilder sb2= new StringBuilder(s2);
        int m= sb1.length();
        int n= sb2.length();
        // Code here
        int dp[][]= new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]= -1;
            }
            
        }
        return count(m-1, n-1 , sb1, sb2, dp);
    }
}