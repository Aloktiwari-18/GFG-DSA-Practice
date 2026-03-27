import java.util.*;

class Solution {
    
    public void solve(int[][] m, int row, int col, int n,
                      ArrayList<String> res, int[][] visited, String path) {
        
        // Destination reached
        if(row == n-1 && col == n-1) {
            res.add(path);
            return;
        }
        
        visited[row][col] = 1;
        
        // Down
        if(row+1 < n && visited[row+1][col] == 0 && m[row+1][col] == 1) {
            solve(m, row+1, col, n, res, visited, path + "D");
        }
        
        // Left
        if(col-1 >= 0 && visited[row][col-1] == 0 && m[row][col-1] == 1) {
            solve(m, row, col-1, n, res, visited, path + "L");
        }
        
        // Right
        if(col+1 < n && visited[row][col+1] == 0 && m[row][col+1] == 1) {
            solve(m, row, col+1, n, res, visited, path + "R");
        }
        
        // Up
        if(row-1 >= 0 && visited[row-1][col] == 0 && m[row-1][col] == 1) {
            solve(m, row-1, col, n, res, visited, path + "U");
        }
        
        // Backtrack
        visited[row][col] = 0;
    }
    
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        
        int n = maze.length;
        ArrayList<String> res = new ArrayList<>();
        
        // Edge case
        if(maze[0][0] == 0 || maze[n-1][n-1] == 0) {
            return res;
        }
        
        int[][] visited = new int[n][n];
        
        solve(maze, 0, 0, n, res, visited, "");
        
        Collections.sort(res); // important
        
        return res;
    }
}