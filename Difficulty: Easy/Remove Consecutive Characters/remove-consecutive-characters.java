// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
         Stack<Character> st1= new Stack<>();
         
         
         for(int i=0;i<s.length();i++){
             if(st1.size()==0) {
                 st1.push(s.charAt(i));
                 continue;
                 
                 
                 
             }
             if(st1.peek()==s.charAt(i)){
                 continue;
             }
             st1.push(s.charAt(i));
             
         }
         Stack<Character> st2= new Stack<>();
         while(!st1.isEmpty()){
             char ch= st1.pop();
             st2.push(ch);
         }
         StringBuilder sb= new StringBuilder();
         while(!st2.isEmpty()){
             char ch= st2.pop();
             sb.append(ch);
         }
         return sb.toString();
         
         
    }
}