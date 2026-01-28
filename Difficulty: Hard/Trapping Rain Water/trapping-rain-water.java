class Solution {
    public int maxWater(int arr[]) {
        int n= arr.length;
        int leftMax[]= new int[n];
        int  rightMax[]= new int[n];
        
        leftMax[0]= arr[0];
        rightMax[n-1]= arr[n-1];
        
        for(int i=1;i<n;i++){
            leftMax[i]= Math.max(arr[i], leftMax[i-1]);
        }
        
        for(int i=n-2;i>=0;i--){
            rightMax[i]= Math.max(arr[i], rightMax[i+1]);
        }
        
        
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=(Math.min(leftMax[i], rightMax[i]))-arr[i];
        }
        return ans;
        
        
     
    }
}
