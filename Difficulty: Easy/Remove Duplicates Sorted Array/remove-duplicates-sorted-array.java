class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        Set<Integer> set= new LinkedHashSet<>();
        for(int ele: arr){
            set.add(ele);
            
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(int ele: set){
            ans.add(ele);
        }
        return ans;
    }
}
