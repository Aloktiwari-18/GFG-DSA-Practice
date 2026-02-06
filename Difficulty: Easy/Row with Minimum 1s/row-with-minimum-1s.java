class Solution {
    int minRow(int mat[][]) {
        // code here
        int n= mat.length;
        int m= mat[0].length;

        int ans=-1;
        int min=(int) (1e6);
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                    
                }
                
                
                
                
            }
            if(min>count){
                    min=count;
                    ans=i+1;
                    
                }
        }
        return ans;
        
    }
};