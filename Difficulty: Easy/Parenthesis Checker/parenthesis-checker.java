class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(st.size()>0 && (st.peek()=='(' && ch==')'   || st.peek()=='{' && ch=='}'  || st.peek()=='[' && ch==']' )){
                st.pop();
            }
            else if(st.size()==0){
                if(ch=='}' || ch==']' || ch==')'){
                    return false;
                }else{
                    st.push(ch);
                }
                
                
            }else{
                st.push(ch);
            }
            
            
            
        }
        return st.isEmpty();
    }
}
