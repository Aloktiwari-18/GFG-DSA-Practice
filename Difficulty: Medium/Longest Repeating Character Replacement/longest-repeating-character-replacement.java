class Solution {
    public int longestSubstr(String s, int k) {
        
      int left=0;
        int right=0;
        int ans=0;
        int max=0;
        int freq[]= new int[26];
        int n=s.length();
        while(right<n){
            freq[s.charAt(right)-'A']++;
            max= Math.max(max, freq[s.charAt(right)-'A']);
            
            if(right-left+1-max >k){
                freq[s.charAt(left)-'A']--;
                max=0;
                for(int i=0;i<25;i++){
                    max=Math.max(max, freq[i]);
                }
                left++;
            }
            if(right-left+1-max<=k){
                ans=Math.max(ans, right-left+1);
                
            }
            right++;
            
            
        }
        return ans;
        
    }
}
