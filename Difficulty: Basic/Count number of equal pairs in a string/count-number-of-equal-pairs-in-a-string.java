// User function Template for Java

class Sol {
    long equalPairs(String s) {
        // your code here
         HashMap<Character,Long> map= new HashMap<>();
         int n= s.length();
         for(int i=0;i<n;i++){
             char c= s.charAt(i);
             map.put(c, map.getOrDefault(c,0L)+1);
         }
        // HashSet<Character> set= new HashSet<>();
        
        // for(int i=0;i<n;i++){
        //      char c= s.charAt(i);
        //      set.add(c);
        //  }
        
         long count=0;
         
         for(char c:map.keySet()){
            long freq= map.get(c);
            count+=freq*freq;
         }
         return count;
    }
}