class Pair{
    String first;
    int second;
    Pair(String _first, int _second){
        this.first=_first;
        this.second=_second;
    }
}

class Solution {
    public int wordLadderLength(String startWord, String targetWord,
                                String[] wordList) {
                                    
        HashSet<String> st= new HashSet<>();
        for(String word:wordList){
            st.add(word);
        }
       
       
       
        
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(startWord,1));
        
        if(!st.contains(targetWord)){
            return 0;
        }
        st.remove(startWord);
        
        while(!q.isEmpty()){
            String s= q.peek().first;
            int step=q.peek().second;
            q.poll();
            if(s.equals(targetWord)) return step;
            for(int i=0;i<s.length();i++){
                char [] arr= s.toCharArray();
                for(char ch='a';ch<='z';ch++){
                    if(arr[i]==ch) continue;
                     arr[i]=ch;
                     String newWord= new String(arr);
                     if(st.contains(newWord)){
                         st.remove(newWord);
                         q.add(new Pair(newWord,step+1));
                     }
                    
                }
                
                
            }
        }
        return 0;
        
        
        
        
        
        
        
        
    }
}