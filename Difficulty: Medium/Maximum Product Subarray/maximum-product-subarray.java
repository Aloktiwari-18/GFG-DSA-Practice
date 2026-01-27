class Solution {
    int maxProduct(int[] arr) {
        int ltoR=1;
        int rtoL=1;
        int n= arr.length;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(ltoR==0){
                ltoR=1;
                
            }
            if(rtoL==0){
                rtoL=1;
            }
            ltoR*=arr[i];
            
            int j=n-i-1;
            rtoL*=arr[j];
            
            maxProduct= Math.max(maxProduct, Math.max(ltoR, rtoL));
        }
return maxProduct;
    }
}