class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int prev=arr[0];
        for(int i=1;i<arr.length;i++){
            int num=arr[i];
            if(prev>num){
                return false;
            }
            prev=num;
        }
        return true;
        
    }
}