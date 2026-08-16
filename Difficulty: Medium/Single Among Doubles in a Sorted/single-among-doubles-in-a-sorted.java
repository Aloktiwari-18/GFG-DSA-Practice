class Solution {
    int single(int[] arr) {
        // code here
        int low=0;
        int n=arr.length;
        int high=arr.length-1;
        if(arr.length==1){
            return arr[0];
     }
     if(arr[0]!=arr[1]) return arr[0];
     if(arr[n-1]!=arr[n-2]) return arr[n-1];
            low=1;
            high=arr.length-2;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            
            else if((mid%2==0 && arr[mid]==arr[mid+1]) ||
            (mid%2==1 && arr[mid]==arr[mid-1])){
                low=mid+1;
            
        }else{
            high=mid-1;
        }
        }
        return -1;
        
    }
}