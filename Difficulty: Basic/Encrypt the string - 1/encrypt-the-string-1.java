// User function Template for Java
class Solution {
    String encryptString(String s) {
        // code here
        int i=0;
        int n= s.length();
        StringBuilder sb= new StringBuilder();
        while(i<n){
            char ch= s.charAt(i);
            int count=0;
            while(i<n && ch==s.charAt(i)){
                count++;
                i++;
            }
            sb.append(ch);
            sb.append(count);
        }
return sb.reverse().toString();          }
}