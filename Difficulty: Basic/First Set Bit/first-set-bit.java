// User function Template for Java

class Solution {
    static int findPosition(int n) {
        int val=0;
        int count=0;
        if(n<=0){
            return -1;
        }
        // code here
        if(n==1){
            return 1;
        }else{
            
            String bin= Integer.toBinaryString(n);
            int len= bin.length();
            
            for(int i=len-1;i>=0;i--){
                if(bin.charAt(i)=='1'){
                    count++;
                    if(count==1){
                        val=len-i;
                    }
                }
                
            }
        }
        if(count==1){
            return val;
        }else{
            return -1;
        }
        
        
        
        
    }
}