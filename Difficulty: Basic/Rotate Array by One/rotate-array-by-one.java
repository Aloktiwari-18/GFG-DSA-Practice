class Solution {
    public void rotate(int[] arr) {
        // code here
        int n= arr.length;
        int res[]= new int[n];
        res[0]=arr[n-1];
        int k=1;
        for(int i=0;i<n-1;i++){
            res[k++]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=res[i];
        }
    }
}