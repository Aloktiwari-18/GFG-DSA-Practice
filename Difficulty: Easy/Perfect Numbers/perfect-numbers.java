class Solution {
    static boolean isPerfect(int n) {
        // code here
        int sum=1;
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                sum+=i;
                sum+=n/i;
            }
        }
        if(sum==n){
            return true;
        }
        return false;
        
    }
};