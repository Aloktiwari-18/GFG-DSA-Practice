class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb= new StringBuilder();
        for(char ch: s.toCharArray()){
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}