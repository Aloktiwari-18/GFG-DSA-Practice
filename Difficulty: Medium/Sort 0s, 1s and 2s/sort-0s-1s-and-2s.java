class Solution {
    public void sort012(int[] arr) {
        // code here
        int st=0;
        int mid=0;
        int end= arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                swap(arr, st,mid);
                st++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid, end);
                end--;
            }
        }
        
    }
        public  void swap(int arr[], int i, int j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
