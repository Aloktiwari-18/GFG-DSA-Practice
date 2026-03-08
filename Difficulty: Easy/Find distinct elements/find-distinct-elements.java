class Solution {
    static int distinct(int arr[], int n) {
        // code here
        HashSet<Integer> set= new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
        return set.size();
        
    }
}