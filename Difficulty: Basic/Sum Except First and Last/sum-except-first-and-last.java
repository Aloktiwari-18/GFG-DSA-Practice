class Solution {
    int sumExceptFirstLast(int[] arr) {
        int n= arr.length;
        // your code here
        int sum=0;
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                continue;
            }
            sum+=arr[i];
            
        }
        return sum;
    }
}