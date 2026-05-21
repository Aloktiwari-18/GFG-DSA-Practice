class Solution {
    int floorSqrt(int n) {
        int res=1;
        // code here
        while(res*res<=n){
            res++;
            
            
        }
        return res-1;
    }
}