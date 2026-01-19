class Solution {
    public static boolean isPowerofTwo(int n) {
         if (n <= 0) return false;
       if(n==1){
           return true;
       }else{
           while(n%2==0){
               n=n/2;
               
           }
           if(n==1){
                   return true;
               }else{
                   return false;
               }
       }
        
    }
}