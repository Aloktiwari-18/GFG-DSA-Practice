class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int min= arr[0];
        int maxAns=arr[0];
        int max= arr[0];
        int minAns=arr[0];
        for(int i=1;i<arr.length;i++){
            max=max+arr[i];
            max=Math.max(max, arr[i]);
            maxAns=Math.max(maxAns, max);
            
            min=min+arr[i];
            min=Math.min(min, arr[i]);
            minAns=Math.min(minAns, min);
            
        }
        int totSum=0;
        for(int i=0;i<arr.length;i++){
            totSum+=arr[i];
            
        }
        if(maxAns<0){
            return maxAns;
        }
        
        return Math.max(maxAns,totSum-minAns);
        
        
        
    }
}
