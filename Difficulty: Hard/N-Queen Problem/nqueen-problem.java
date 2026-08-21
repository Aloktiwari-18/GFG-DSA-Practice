class Solution {
     public boolean isSafe(int[][] board, int row, int col)
        {
            for(int r=row;r>=0;r--)
            {
                if(board[r][col]==1)
                {
                    return false;
                }
            }
            for(int r=row, c=col;r>=0 && c>=0;r--, c--)
            {
                if(board[r][c]==1)
                {
                    return false;
                }
            }
            for(int r=row, c=col;r>=0 && c<board[0].length;r--, c++)
            {
                if(board[r][c]==1)
                {
                    return false;
                }
            }
            return true;
        }
        public void generate(int[][] board, int row, ArrayList<ArrayList<Integer>> ans)
     {
         if(row==board.length)
         {
             ArrayList<Integer> temp=new ArrayList<>();
             for(int i=0;i<board.length;i++)
             {
                 for(int j=0;j<board[0].length;j++)
                 {
                     if(board[i][j]==1)
                     {
                         temp.add(j+1);
                     }
                 }
             }
             ans.add(temp);
             return;
         }
         for(int col=0;col<board[0].length;col++)
         {
             if(isSafe(board, row, col))
             {
                 board[row][col]=1;
                 generate(board, row+1, ans);
                 board[row][col]=0;
             }
         }
     }
        
        
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       int[][] board=new int[n][n];
       generate(board, 0, ans);
       return ans; 
        
    }
}

