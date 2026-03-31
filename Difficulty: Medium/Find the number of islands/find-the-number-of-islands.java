class Solution {
    public static void dfs(int i, int j, char [][] grid){
        int n= grid.length;
        int m= grid[0].length;
        
        if(i<0 || i>=n || j<0 ||  j>=m|| grid[i][j]=='W'){
            return ;
        }
        grid[i][j]='W';
        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        for(int k = 0; k < 8; k++){
            dfs(i + dx[k], j + dy[k], grid);
        }
       
    }
    public int countIslands(char[][] grid) {
        // Code here
        int n= grid.length;
        int m= grid[0].length;
        // int vis[][]= new int[m][n];
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='L'){
                    count++;
                    dfs(i,j, grid);
                }
                
                
            }
        }
        return count;
        
        
    }
}