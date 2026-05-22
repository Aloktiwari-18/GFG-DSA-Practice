class Solution {
    int maxSubstring(String s) {
        // code here
         int n= s.length();
         int prefix= s.charAt(0)=='0' ?1:-1;
         int ans= prefix;
         for(int i=1;i<n;i++){
             int val= s.charAt(i)=='0' ?1:-1;
             prefix= Math.max(prefix+val, val);
             ans= Math.max(prefix, ans);
             
         }
         return ans;
         
         
    }
}