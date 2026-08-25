class Solution {
    public String removeSpaces(String s) {
        // code here
        StringBuilder sb= new StringBuilder();
        for (char ch:s.toCharArray()){
            if(ch==' '){
                continue;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}