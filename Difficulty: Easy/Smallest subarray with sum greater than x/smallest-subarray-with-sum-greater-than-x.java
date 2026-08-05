class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int left=0;
        int n= arr.length;
        int min= Integer.MAX_VALUE;
        int right=0;
        int sum=0;
        while(right<n){
            sum+=arr[right];
            while(sum>x){
                int count=right-left+1;
                min= Math.min(count, min);
                sum-=arr[left];
                left++;
            }
            right++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }else{
            return min;
        }
    }
}
