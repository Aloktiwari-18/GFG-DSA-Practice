class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int left=0;
        int right=0;
        int n=arr.length;
        int zero=0;
        int max=0;
        while(right<n){
            if(arr[right]==0){
                zero++;
            }
            while(zero>k){
                if(arr[left]==0){
                    zero--;
                    
                }
                
                left++;
                
            }
            if(zero<=k){
                max=Math.max(max, right-left+1);
            }
            
            right++;
        }
        return max;
        
    }
}