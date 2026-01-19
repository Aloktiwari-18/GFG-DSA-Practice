// User function Template for Java
class Solution {
    static int setBits(int n) {
       
        
        int count =0;
        while(n>0){
            if(n%2==1){
                count=count+1;
            }
            n=n/2;
        }
        
        return count;
        
    }
}