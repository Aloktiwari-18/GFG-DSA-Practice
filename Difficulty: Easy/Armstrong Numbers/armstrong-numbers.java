class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int count=0;
        int num=n;
        while(num>0){
            num=num/10;
            count++;
        }
        int sum=0;
        int act=n;
        while(act>0){
            int rem= act%10;
            sum+=Math.pow(rem, count);
            act=act/10;
            
        }
        if(n==sum){
            return true;
        }
        return false;
    }
}