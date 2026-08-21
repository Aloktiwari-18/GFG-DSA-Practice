class Solution {
    public boolean isValid(StringBuilder sb){
        Stack<Character> st= new Stack<>();
        for(int i=0;i<sb.length();i++){
            if(st.size()==0 && sb.charAt(i)==')'){
                return false;
            }
             else if(st.size()==0 && sb.charAt(i)=='('){
                st.push(sb.charAt(i));
            }
             else if(st.size()>0 && st.peek() =='(' && sb.charAt(i)==')'){
                st.pop();
            }
            else{
               st.push(sb.charAt(i)); 
            }
            
        }
        return st.size()==0;
    }
    public void solve(int n , ArrayList<String> ans, StringBuilder sb){
        if(sb.length()==n){
            if(isValid(sb)){
                 ans.add(sb.toString());
                 
            }
            return ;
        }
        sb.append('(');
        solve(n, ans, sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        solve(n, ans, sb);
        sb.deleteCharAt(sb.length()-1);
    }
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> ans= new ArrayList<>();
       StringBuilder sb= new StringBuilder();
        solve(n, ans, sb);
        return ans;
        
    }
}