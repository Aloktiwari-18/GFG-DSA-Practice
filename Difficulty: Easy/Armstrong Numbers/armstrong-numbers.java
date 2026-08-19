class Solution {
    static boolean armstrongNumber(int n) {
        int count=0;
        int real=n;
        while(real>0){
            count++;
            real=real/10;
        }
        int sum=0;
        int num=n;
        while(num>0){
            int rem= num%10;
            sum+=Math.pow(rem, count);
            num=num/10;
        }
        if(sum==n){
            return true;
        }
        // code here
        return false;
        
    }
}