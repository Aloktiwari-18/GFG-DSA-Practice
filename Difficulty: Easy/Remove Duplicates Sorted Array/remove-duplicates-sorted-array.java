class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        ArrayList<Integer> res= new ArrayList<>();
        int [] ans=new int[set.size()];
        int k=0;
        for(int ele:set){
            ans[k++]=ele;
            
        }
        
       Arrays.sort(ans);
       for(int i=0;i<ans.length;i++){
           res.add(ans[i]);
       }
       return res;
    }
}
