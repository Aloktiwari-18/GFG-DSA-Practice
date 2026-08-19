class Solution {
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    static int nthFibonacci(int n) {
        // code here
        return fib(n);
    }
}