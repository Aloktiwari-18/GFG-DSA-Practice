class Solution {
    public static int kthLargest(int[] arr, int m) {
         int n= arr.length;
        int tot= (n*(n+1))/2;
        // code here
        int[] ans = new int[tot];
       
        int k=0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                ans[k++]=sum;
            }
        }
        // System.out.println(st.size());
        
        
       Arrays.sort(ans);
       

        return ans[ans.length-m];
        
        
        
    }
}
