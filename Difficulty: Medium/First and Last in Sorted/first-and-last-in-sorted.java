class Solution {
    public int lower_bound(int arr[], int x, int n){
        int low=0;
        int high=arr.length-1;
        int ans=n;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int upper_bound(int arr[], int x, int n){
        int low=0;
        int high=arr.length-1;
        int ans=n;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    ArrayList<Integer> find(int arr[], int x) {
        int n= arr.length;
        
        ArrayList<Integer> res= new ArrayList<>();
        int lb= lower_bound(arr, x, n);
        if(arr[lb]!=x || lb==n){
           for(int i=0;i<2;i++){
               res.add(-1);
           }
           return res;
        }
        int up=upper_bound(arr, x, n);
        res.add(lb);
        res.add(up-1);
        return res;
        
    }
}
