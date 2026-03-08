class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set= new HashSet<>();
        
        for(int ele:arr){
            if(set.contains(target-ele)){
                return true;
            }
            set.add(ele);
        }
        return false;
        
    }
}