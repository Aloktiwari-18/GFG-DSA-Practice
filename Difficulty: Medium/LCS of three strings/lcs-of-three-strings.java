class Solution {
    public static int lcs(int i, int j, int k ,StringBuilder sb1, StringBuilder sb2,StringBuilder sb3, int [][][]dp){
        if(i<0 || j<0 || k<0){
            return 0;
        }
        if(dp[i][j][k]!=-1){
            return dp[i][j][k];
        }
        if(sb1.charAt(i)==sb2.charAt(j) && sb2.charAt(j)==sb3.charAt(k)){
           return dp[i][j][k]= 1+lcs(i-1,j-1, k-1,sb1, sb2,sb3, dp);
        }else{
                        return dp[i][j][k] = Math.max(
                    lcs(i-1, j, k, sb1, sb2, sb3, dp),
                    Math.max(
                        lcs(i, j-1, k, sb1, sb2, sb3, dp),
                        lcs(i, j, k-1, sb1, sb2, sb3, dp)
                    )
            );
        }
    }

    int lcsOf3(String s1, String s2, String s3) {
        StringBuilder sb1=new StringBuilder (s1);
        StringBuilder sb2=new StringBuilder (s2);
        StringBuilder sb3=new StringBuilder (s3);
        int m=sb1.length();
        int n= sb2.length();
        int o= sb3.length();
        
        int dp[][][]= new int [m][n][o];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<o;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return lcs(m-1,n-1,o-1, sb1, sb2, sb3, dp);
    
        
        
    }
}