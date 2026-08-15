class Solution {
    public int solver (int arr[], int target){
        int left=0;
        int right=0;
        int n= arr.length;
        int sum=0;
        int count=0;
        while(right<n){
            sum+=arr[right];
            while(sum>target){
            
                
                sum-=arr[left];
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] arr, int target) {
        // code here
        return solver(arr, target)-solver(arr, target-1);
        
    }
}