class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character , Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int maxFreq=0;
        
        for(char ch:map.keySet()){
            int freq= map.get(ch);
            maxFreq= Math.max(freq, maxFreq);
            
        }
        char lexi= 'z';
        for(char ch:map.keySet()){
            int freq=map.get(ch);
            if(freq==maxFreq && ch<lexi){
                lexi= ch;
                
            }
        }
        return lexi;
    }
}