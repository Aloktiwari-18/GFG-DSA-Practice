class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> set= new HashSet<>();
        int left=0;
        int right=0;
        int ans= Integer.MIN_VALUE;
        while(right<s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans=Math.max(right-left+1,ans);
            right++;
        }
        return ans;
    }
}