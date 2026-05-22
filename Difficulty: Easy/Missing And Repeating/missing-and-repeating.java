class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        int n= arr.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        ans.add(0);
        ans.add(0);
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int i=1;i<=n;i++){
            int count= map.getOrDefault(i,0);
            
            if(count==0){
                ans.set(1,i);
                }
            if(count==2){
                ans.set(0,i);
            }
        }
        return ans;
    }
}
