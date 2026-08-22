class Solution {
    public int solve(String s, int idx, int sign, int res){
        if(idx>=s.length()){
            return sign * res;
        }
        char ch= s.charAt(idx);
        int digit= s.charAt(idx)-'0';
        if(!Character.isDigit(ch)){
           
           return sign * res;
        }
        if(res>(Integer.MAX_VALUE-digit)/10){
          return  sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
       res= res*10+digit;
       return solve(s, idx+1, sign, res);
        
        
        
        
        
    }
    public int myAtoi(String s) {
        
        // code here
       s= s.trim();
       if(s.length()==0){
            return 0;
        }
        int idx=0;
        int sign=1;
        
        if(s.charAt(idx)=='+' || s.charAt(idx)=='-'){
            sign=(s.charAt(idx)=='-') ? -1: 1;
            idx++;
        }
       return solve(s, idx, sign, 0);
         
        
    }
}