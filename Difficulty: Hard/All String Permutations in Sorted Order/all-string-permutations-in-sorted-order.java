class Solution {
    public void solve(String s, int idx, StringBuilder sb, boolean [] used, ArrayList<String> ans){
        if(sb.length()==s.length()){
            ans.add(sb.toString());
            return;
        }
        
        for(int i= 0;i<s.length();i++){
            if(used[i]) continue;
            sb.append(s.charAt(i));
            used[i]=true;
            solve(s, i+1, sb, used, ans);
            sb.deleteCharAt(sb.length()-1);
            
            used[i]=false;
           
        }
        
        
    }
    public ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> ans= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        boolean used[]= new boolean[s.length()];
        
        solve(s, 0, sb, used, ans);
        Collections.sort(ans);
        return ans;
    }
}