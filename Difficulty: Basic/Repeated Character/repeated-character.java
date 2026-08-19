class Solution {
    char firstRep(String S) {
        // your code here
        HashMap<Character , Integer> map= new HashMap<>();
        for(char ch:S.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch:S.toCharArray()){
            if(map.get(ch)>1){
                return ch;
            }
        }
        return '#';
        
    }
}