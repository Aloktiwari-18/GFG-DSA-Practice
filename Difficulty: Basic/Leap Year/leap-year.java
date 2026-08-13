class Solution {
    static boolean checkYear(int n) {
        // code here
        if(n%4==0){
            if(n%100==0){
                return n%400==0;
            }
            return true;
        }
        return false;
    }
}