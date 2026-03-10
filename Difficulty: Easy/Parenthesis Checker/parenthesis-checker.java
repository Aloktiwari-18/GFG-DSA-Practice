class Solution {
    public static boolean sameType(char top, char ch){
        if(top=='[' && ch==']') return true;
        if(top=='{' && ch=='}') return true;
        if(top=='(' && ch==')') return true;
        else return false;
    }
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);

          
           if(ch=='(' || ch== '{' || ch=='[') st.push(ch);
           else{
               if(st.size()==0){
                   return false;
               }
               char top= st.peek();
               if(sameType(top, ch)) st.pop();
               else return false;
           }
        }
        return (st.size()==0);
        
    }
}
