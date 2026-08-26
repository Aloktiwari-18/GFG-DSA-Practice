class Solution {
    String removeDuplicates(String s) {
        
        HashSet<Character> set= new HashSet<>();
        StringBuilder sb= new StringBuilder ();
        for(char ch:s.toCharArray()){
            if(!set.contains(ch)){
                sb.append(ch);
            }
            set.add(ch);
        }
        return sb.toString();
    }
}
