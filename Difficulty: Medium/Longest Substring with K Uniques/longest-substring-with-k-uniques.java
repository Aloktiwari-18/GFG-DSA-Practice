class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        
        int max=-1;
        int left=0;
        HashMap<Character, Integer> map= new HashMap<>();
        
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);
            
            while(map.size()>k){
                char ch= s.charAt(left);
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
                left++;
            }
            
            if(map.size()==k){
                max= Math.max(max, right-left+1);
            }
            
            
            
        }
        return max;
    }
}