class Solution {
    static int[] dx = {2,2,-2,-2,1,1,-1,-1};
    static int[] dy = {1,-1,1,-1,2,-2,2,-2};
    
    public static boolean isSafe(int x, int y, int [][] board, int n){
       return (x >= 0 && y >= 0 && x < n && y < n && board[x][y] == -1);
    }
    public static boolean solve(int i, int j, int move ,int [][]board, int n){
        if(move==n*n) return true;
        
        for(int x=0;x<8;x++){
            int nx= i+ dx[x];
            int ny= j+ dy[x];
            
            if(isSafe(nx, ny, board, n)){
                board[nx][ny]= move;
               if(solve(nx, ny, move+1, board ,n)){
                   return true;
                   
               }
               board[nx][ny]= -1;
            }
            
        }
        return false;
       
        

        
    }
    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        // code here
      
        int board[][]= new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = -1;
            }
        }
        

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        board[0][0]=0;
        if(!solve(0, 0, 1, board, n)) return new ArrayList<>();
        
        for(int i=0;i<n;i++){
            ArrayList<Integer> row= new ArrayList<>();
            for(int j=0;j<n;j++){
               
                row.add(board[i][j]);
            }
            ans.add(row);
        }
return ans;
        
    }
}