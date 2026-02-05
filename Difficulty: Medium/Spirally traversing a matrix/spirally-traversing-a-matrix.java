class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] matrix) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
       int left=0;
       int top=0;
       int bottom=matrix.length-1;
       int right=matrix[0].length-1;
       
       while(left<=right && top<=bottom){
           for(int j=left;j<=right;j++){
               ans.add(matrix[top][j]);
           }
           top++;
           
           for(int i=top;i<=bottom;i++){
               ans.add(matrix[i][right]);
           }
           right--;
           
           if(top<=bottom){
               for(int k=right;k>=left;k--){
                   ans.add(matrix[bottom][k]);
               }
            bottom--;
               
           }
           if(left<=right){
               for(int l=bottom;l>=top;l--){
                   ans.add(matrix[l][left]);
               }
               left++;
           }
       }
       return ans;
       
        
        
    }
}
