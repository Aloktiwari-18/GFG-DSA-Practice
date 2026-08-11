class Solution {
    public boolean isPalinSent(String s) {
        // code here
        StringBuilder sb= new StringBuilder ();
        for(char ch: s.toCharArray()){
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
           else if(ch>='A' && ch<='Z'){
                 sb.append(Character.toLowerCase(ch));
            }
            else if (ch>='0' && ch<='9'){
                sb.append(ch);
            }
            else{
                continue;
            }
            
        }
        int st=0;
        int end=sb.length()-1;
        while(st<=end){
            if(sb.charAt(st)!=sb.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}