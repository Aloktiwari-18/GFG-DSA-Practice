class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n<=1) return false;
        int i=2;
        while(i*i<=n){
            if(n%i++==0) return false;
        }
        return true;
    }
}