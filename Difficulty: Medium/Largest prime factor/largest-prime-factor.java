// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int max= Integer.MIN_VALUE;
        while(n%2==0){
            n=n/2;
            max=Math.max(max, 2);
        }
        for(int i=3;i<=n;i++){
            while(n%i==0){
                max=Math.max(max,i);
                n=n/i;
            }
        }
        return max;
    }
}