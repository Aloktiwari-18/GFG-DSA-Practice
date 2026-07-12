class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        ArrayList<Integer> res= new ArrayList<>();
        Stack <Integer> st= new Stack<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            res.add(0);
        }
        
        for(int i=2*n-1 ;i>=0;i--){
            while(st.size()!=0 && st.peek()<=arr[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.size()==0){
                    res.set(i,-1);
                }else{
                    res.set(i, st.peek());
                }
            }
            st.push(arr[i%n]);
        }
        return res;
    }
}