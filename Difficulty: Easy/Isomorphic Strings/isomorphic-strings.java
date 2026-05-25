class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        HashMap<Character, Character> map1= new HashMap<>();
        HashMap<Character, Character> map2= new HashMap<>();
        
        
        for(int i=0;i<s1.length();i++){
            char s= s1.charAt(i);
            char t= s2.charAt(i);
            
            
            if(!map1.containsKey(s)){
                map1.put(s, t);
            }
            if(!map2.containsKey(t)){
                map2.put(t, s);
            }
            if(map1.get(s)!=t || map2.get(t)!=s){
                return false;
            }
        }
        return true;
    }
}