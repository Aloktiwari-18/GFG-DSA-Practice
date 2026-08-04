class Solution {

    int search(String pat, String txt) {
        // code here
        int tl= txt.length();
        int pl=pat.length();
        int patFreq[]= new int[26];
        for(char ch: pat.toCharArray()){
            patFreq[ch-'a']++;
        }
        int count=0;
        int left=0;
        int txtFreq[]= new int[26];
        for(int right=0;right<txt.length();right++){
            txtFreq[txt.charAt(right)-'a']++;
            
            if(right-left+1>pl){
                txtFreq[txt.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1==pl){
                boolean same=true;
                
                for(int i=0;i<26;i++){
                    if(txtFreq[i]!=patFreq[i]){
                        same=false;
                    }
                }
                if(same){
                    count++;
                }
            }
        }
        return count;
        
    }
}