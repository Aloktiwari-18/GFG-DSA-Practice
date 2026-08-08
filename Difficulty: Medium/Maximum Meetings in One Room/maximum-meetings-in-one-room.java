class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        ArrayList<ArrayList<Integer>> meet= new ArrayList<>();
        
         ArrayList<Integer> ans= new ArrayList<>();
       for(int i=0;i<s.length;i++){
           ArrayList<Integer> curr= new ArrayList<>();
           curr.add(s[i]);
           curr.add(f[i]);
           curr.add(i+1);
           meet.add(curr);
           
       }
       
       meet.sort((a,b)->{
           if(a.get(1)==b.get(1)){
               return Integer.compare(a.get(2), b.get(2));
           }else{
               return Integer.compare(a.get(1), b.get(1));
           }
       });
       int lastFinish= meet.get(0).get(1);
       ans.add(meet.get(0).get(2));
       
       for(int i=1;i<meet.size();i++){
           int st= meet.get(i).get(0);
            int end= meet.get(i).get(1);
             int ind= meet.get(i).get(2);
             
             
             if(lastFinish<st){
                 ans.add(ind);
                 lastFinish=end;
             }
       }
       Collections.sort(ans);
       return ans;
       
        
    }
}