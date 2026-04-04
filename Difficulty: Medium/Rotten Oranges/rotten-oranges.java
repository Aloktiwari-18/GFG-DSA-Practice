class Pair{
    int row;
    int col;
    int tm;
    
    Pair(int row, int col, int tm){
        this.row=row;
        this.col= col;
        this.tm= tm;
        
    }
}


class Solution {
    public int orangesRot(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;
        
        int vis[][] = new int[m][n];
        Queue<Pair> q= new LinkedList<>();
        int cntFresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==2){
                    q.add(new Pair(i,j,0));
                }else{
                    vis[i][j]=0;
                }
                if(mat[i][j]==1){
                    cntFresh++;
                }
            }
        }
        int dr[]= {-1,0,0,1};
        int dc[]= {0,-1, 1, 0};
        int tm=0;
        int count=0;
       
        while(!q.isEmpty()){
            Pair curr= q.peek();
            int row= curr.row;
            int col= curr.col;
            int t= curr.tm;
             tm= Math.max(tm, t);
            q.remove();
            
            for(int i=0;i<4;i++){
                int nrow= row + dr[i];
                int ncol= col + dc[i];
                
                if(nrow>=0  && nrow <m && ncol>=0 && ncol <n && vis[nrow][ncol]==0 &&  mat[nrow][ncol]==1){
                    q.add(new Pair(nrow, ncol, t+1));
                    vis[nrow][ncol]=2;
                    count++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && vis[i][j]!=2){
                    return -1;
                }
            }
        }
        return tm;

        
        
        
    }
}