class Solution {
    public static boolean isSafe(int node, int c, int [] color, ArrayList<ArrayList<Integer>> adj){
        for(int neig: adj.get(node)){
           if( color[neig]== c){
               return false;
           }
        }
        return true;
    }
    public static boolean solve(int node, int v, int [] color, int m, ArrayList<ArrayList<Integer>> adj){
        if(node==v) return true;
        for(int c=1;c<=m;c++){
            if(isSafe(node, c, color,adj)){
                color[node]=c;
                if(solve(node+1, v, color, m, adj)) return true;
                color[node]=0;
            }

            
        }
        return false;
    }
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int []edge: edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int [] color= new int[v];
       return solve(0, v, color, m ,adj );
        
        
        
        
    }
}