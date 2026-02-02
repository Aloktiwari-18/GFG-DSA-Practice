class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        int res=0;
        int n= arr.length;
        int count=0;
        HashSet<Integer> set= new HashSet<>();
        
        for(int val:arr){
            set.add(val);
        }
        
        
        for(int val:arr){
            if(set.contains(val) && !set.contains(val-1)){
                int curr=val;
                count=0;
                
                while(set.contains(curr)){
                    // set.remove(curr);
                    curr++;
                    count++;
                }
                res= Math.max(res,count);
                
            }
            
        }
        return res;


        
    }
}