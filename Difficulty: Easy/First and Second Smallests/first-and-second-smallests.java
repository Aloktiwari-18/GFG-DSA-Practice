class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int smallest=Integer.MAX_VALUE;
        int secSmallest=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<smallest){
                secSmallest=smallest;
                smallest=num;
            }else if(num<secSmallest && num> smallest){
                secSmallest=num;
            }
        }
        if(secSmallest == Integer.MAX_VALUE){
            ArrayList<Integer> res = new ArrayList<>();
            res.add(-1);
            return res;
        }
        ans.add(smallest);
        ans.add(secSmallest);
        return ans;
        
    }
}
