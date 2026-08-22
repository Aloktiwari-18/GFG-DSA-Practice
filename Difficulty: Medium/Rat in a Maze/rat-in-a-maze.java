class Solution {
    public void solve(int[][] maze, int row, int col, ArrayList<String> ans, int[][] vis, StringBuilder path){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            ans.add(path.toString());
          return;
        }
        vis[row][col]= 1;
        // Down
        if(row+1<maze.length && vis[row+1][col]==0 && maze[row+1][col]==1){
            path.append("D");
            solve(maze, row+1, col, ans, vis, path);
            path.deleteCharAt(path.length() - 1);
        }
        
        // Right
        if(col+1<maze[0].length && vis[row][col+1]==0  && maze[row][col+1]==1){
            path.append("R");
            solve(maze, row, col+1, ans, vis, path);
            path.deleteCharAt(path.length() - 1);
        }
        // Left
        if(col-1 >=0 && vis[row][col-1]==0  && maze[row][col-1]==1){
            path.append("L");
            solve(maze, row, col-1, ans, vis, path);
            path.deleteCharAt(path.length() - 1);
        }
        // up
        if(row-1>=0 && vis[row-1][col]==0  && maze[row-1][col]==1){
            path.append("U");
            solve(maze, row-1, col, ans, vis, path);
            path.deleteCharAt(path.length() - 1);
        }
        vis[row][col]=0;
        
    }  
        
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n= maze.length;
        int m= maze[0].length;
         ArrayList<String> ans=new ArrayList<>();
        if(maze[n-1][m-1]==0 || maze[0][0]==0){
            return ans;
        }
        
       
        StringBuilder sb= new StringBuilder();
        int vis[][]=new int[n][m];
      
        
        
        solve(maze, 0, 0,  ans, vis, sb);
        Collections.sort(ans);
        return ans;
        
        
    }
}