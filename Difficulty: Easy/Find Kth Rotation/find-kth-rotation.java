class Solution {
     public int findKRotation(int[] arr) {
         // code here
         int min=Integer.MAX_VALUE;
         int low=0;
         int high=arr.length-1;
         int index=-1;
         while(low<=high){
             int mid= (low+high)/2;
             if(arr[low]<=arr[mid]){
                 if(arr[low]<min){
                     index=low;
                     min=arr[low];
                 }
                 
                 low=mid+1;
             }else{
                 if(arr[mid]<min){
                     index=mid;
                     min=arr[mid];
                 }
                 
                 high=mid-1;


             }
         }
         return index;
     }
 }
