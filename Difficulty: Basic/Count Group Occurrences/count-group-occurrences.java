class Sol {
    int getCount(String s, int k) {
       Map<Character, Integer> map = new HashMap<>();
                    int count = 0;

                    for (int i=0; i<s.length(); i++) {
                        Character c = s.charAt(i);

                        if (i < s.length()-1 && c == s.charAt(i+1)) {
                            continue;
                        }

                        int charCount = map.getOrDefault(c, 0);
                        charCount++;
                        map.put(c, charCount);
                    }
        for(int freq:map.values()){
            if(freq==k){
                count++;
                
            }
            
        }
        return count;
        
    }
}