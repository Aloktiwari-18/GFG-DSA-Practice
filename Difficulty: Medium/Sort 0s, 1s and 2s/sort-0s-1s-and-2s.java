class Solution {
    public void sort012(int[] arr) {
        // code here
        int s=0;
        int m=0;
        int e= arr.length-1;
        while(m<=e){
            if(arr[m]==0){
                swap(arr, s, m);
                s++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }else{
                swap(arr,m, e);
                    e--;
                    
                
            }
        }
    }
        public static void swap(int arr[], int s, int y){
            int temp= arr[s];
            arr[s]=arr[y];
            arr[y]=temp;
        
    }
}