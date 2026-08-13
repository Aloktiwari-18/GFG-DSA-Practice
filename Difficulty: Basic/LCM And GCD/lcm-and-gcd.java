class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int x=a;
        int y=b;
        while(y!=0){
            int r= x%y;
            x=y;
            y=r;
        }
        int gcd= x;
        int lcm= (a*b)/gcd;
        int ans[]= new int[]{lcm, gcd};
        return ans;
    }
}