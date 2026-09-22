class Solution {
    public void dfs(int i, int j, char [][]grid){
       int n= grid.length;
        int m= grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]!='L'){
            return ;
        }
        grid[i][j]='W';
        dfs(i-1, j, grid);
        dfs(i, j-1, grid);
        dfs(i+1, j, grid);
        dfs(i,j+1, grid);
        
        dfs(i-1, j-1, grid);
        dfs(i+1, j+1, grid);
        dfs(i+1, j-1, grid);
        dfs(i-1, j+1, grid);
        
    }
    public int countIslands(char[][] grid) {
        if(grid == null || grid.length == 0) {
                    return 0;
        }
        int n= grid.length;
        int m= grid[0].length;
        int land=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='L'){
                    land++;
                    dfs(i, j, grid);
                }
            }
        }
        return land;
        
    }
}