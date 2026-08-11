class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] sb = s.split("\\.");
        int st=0;
        int end=sb.length-1;
        StringBuilder sb1= new StringBuilder();
        if(sb[0].equals("")){
            st++;
            
        }
        while(st<end){
            String s1= sb[st];
            sb[st]=sb[end];
            sb[end]=s1;
            st++;
            end--;
        }
        
        for(int i=0;i<sb.length;i++){
            if(sb[i].equals("")){
                continue;
            }
            if(sb1.length()>0){
                sb1.append(".");
            }
            sb1.append(sb[i]);
            
        }
        
        return sb1.toString();
    }
}
