class Solution {
    public static int carAssembly(int n, int[][] a, int[][] T, int[] e, int[] x) {
        // code here
        
        int f1[]= new int[n];
        int f2[]= new int[n];
        f1[0]= e[0]+a[0][0];
        f2[0]= e[1]+a[1][0];
        
        
        for(int i=1;i<n;i++){
            f1[i]=Math.min(
                f1[i-1]+a[0][i],
                f2[i-1]+T[1][i] +a[0][i]

                );
                
            f2[i]= Math.min(
                f2[i-1]+a[1][i],
                f1[i-1]+T[0][i]+a[1][i]
                );
                
        }
                return Math.min(f1[n-1]+x[0], f2[n-1]+x[1]);

    }
}
