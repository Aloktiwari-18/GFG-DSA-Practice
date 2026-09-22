class Solution {
    public  void dfs(int i, int j, int[][] img, int newCol, int oldCol){
        int n= img.length;
        int m=img[0].length;
        
        if(i<0  || j<0 || i>=n || j>=m || img[i][j]!=oldCol){
            return;
        }
        img[i][j]=newCol;
        dfs(i,j+1,img, newCol, oldCol);
        dfs(i,j-1,img, newCol, oldCol);
        dfs(i+1,j,img, newCol, oldCol);
        dfs(i-1,j,img, newCol, oldCol);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // code here
        int oldColor= image[sr][sc];
        if(oldColor==newColor){
            return image;
        }
        dfs(sr, sc, image, newColor, oldColor);
        return image;
    }
}