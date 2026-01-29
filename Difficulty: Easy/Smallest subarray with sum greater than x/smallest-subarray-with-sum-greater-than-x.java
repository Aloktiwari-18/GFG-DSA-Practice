class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int n= arr.length;
        int left=0;
        int right=0;
        int count=0;
        int minCount=Integer.MAX_VALUE;
        int sum=0;
        while(right<n){
            sum+=arr[right];
            while(sum>x){
                count=right-left+1;
                minCount=  Math.min(count, minCount);
                 sum-=arr[left];
                left++;
               
                
            }
            right++;
        }
        
        if(minCount==Integer.MAX_VALUE){
            return 0;
        }
        return minCount;
    }
}
