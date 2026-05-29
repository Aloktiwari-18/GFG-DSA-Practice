class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int left=0;
        int right=0;
        int max= Integer.MIN_VALUE;
        boolean vis[]= new boolean[26];
        while(right<s.length()){
            while(vis[s.charAt(right)-'a']==true){
                vis[s.charAt(left)-'a']=false;
                left++;
            }
            vis[s.charAt(right)-'a']=true;
            max=Math.max(max, right-left+1);
            right++;
            
        }
        return max;
    }
}