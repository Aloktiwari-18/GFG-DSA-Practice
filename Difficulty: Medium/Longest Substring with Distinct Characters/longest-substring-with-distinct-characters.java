class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> set= new HashSet<>();
        int right=0;
        int left=0;
        int ans=Integer.MIN_VALUE;
        while(right<s.length()){
            char ch= s.charAt(right);
            while(set.contains(ch)){
                
                set.remove(s.charAt(left));
                left++;
            }
            ans=Math.max(ans, right-left+1);
            set.add(ch);
            right++;
        }
        return ans;
    }
}