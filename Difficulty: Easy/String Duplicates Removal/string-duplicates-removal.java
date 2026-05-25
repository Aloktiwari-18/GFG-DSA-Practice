// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        
        StringBuilder sb= new StringBuilder ();
        
        int n= s.length();
        boolean vis[]= new boolean[128];
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            
            if(vis[ch]==false){
                vis[ch]= true;
                sb.append(ch);
            }
            if(vis[ch]==true){
                continue;
            }
        }
        return sb.toString();
        
        
        
        
    }
}
