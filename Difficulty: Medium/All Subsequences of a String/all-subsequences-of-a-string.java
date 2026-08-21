class Solution {
    public void solve(String s,int idx, StringBuilder sb, List<String> ans){
        if(idx>=s.length()){
            
                ans.add(sb.toString());
            
            
            return;
            
        }
        sb.append(s.charAt(idx));
        solve(s, idx+1, sb, ans);
        sb.deleteCharAt(sb.length()-1);
        solve(s,idx+1, sb, ans);
        
    }
    public List<String> powerSet(String s) {
        // Code here
        List<String> ans= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        
        solve(s, 0,sb , ans);
        Collections.sort(ans);
        return ans;
        
    }
}