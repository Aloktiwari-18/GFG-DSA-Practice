class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target){
                    return true;
                }
                else if(sum>target){
                    k--;
                }
                else if(sum<target){
                    j++;
                }
            }
            
        }
        return false;


        
    }
}
