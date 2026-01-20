class Solution {
    boolean isPowerTwo(long n){
        return (n&(n-1))==0;
    }
    boolean isSquare(long n){
        long num= (long)(Math.sqrt(n));
        return (num*num)==n;
    }
    int isPowerOfFour(long n) {
        return isPowerTwo(n) && isSquare(n)?1:0;
        
        
    }
}