class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n= arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        res.add(-1);
        Stack<Integer> st= new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            while(st.size()!=0 && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res.add(-1);
                
            }else{
                res.add(st.peek());
            }
            st.push(arr[i]);
            
        }
        return res;
    }
}