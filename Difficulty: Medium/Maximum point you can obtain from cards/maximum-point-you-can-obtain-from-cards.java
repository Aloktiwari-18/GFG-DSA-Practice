class Solution {
    public int maxScore(int[] cP, int k) {
        // code here.
       int n= cP.length;
       int max=0;
       int sum=0;
       for(int i=0;i<k;i++){
           sum+=cP[i];
           max=Math.max(sum, max);
           
       }
       int right=n-1;
       int rSum=0;
       for(int i=k-1;i>=0;i--){
           sum-=cP[i];
           rSum+=cP[right];
           right--;
           max=Math.max(max, sum+rSum);
           
       }
       return max;
    }
}
