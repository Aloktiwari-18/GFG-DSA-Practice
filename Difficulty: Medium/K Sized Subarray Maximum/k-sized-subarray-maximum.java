class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        Deque<Integer> dq= new ArrayDeque<>();
        int left=0;
        for(int right=0;right<arr.length;right++){
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[right]){
                dq.pollLast();
            }
            dq.offerLast(right);
            
            if(dq.peekFirst()<left){
                dq.pollFirst();
            }
            if(right-left+1==k){
                ans.add(arr[dq.peekFirst()]);
                left++;
            }
        }
        return ans;
    }
}