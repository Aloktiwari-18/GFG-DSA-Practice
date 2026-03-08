class Solution {
    public char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int maxFreq=0;
        for(char ch:map.keySet()){
            int freq= map.get(ch);
            maxFreq= Math.max(maxFreq, freq);
        }
        char ans= 'z';
        for(char ch: map.keySet()){
            int freq= map.get(ch);
            if(maxFreq==freq && ch<ans) {
                ans= ch;
        }
        
        }
        return ans;
        // code here
        
    }
}