
class Solution {
    boolean search(int[] arr, int target) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[low]==arr[mid]&& arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            //left hand sorted
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=target && arr[mid]>=target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[high]){
                    low=mid+1;

                }else{
                    high=mid-1;
                }
            }

        }
        return false;
    }
}