class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n= arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            res.add(0);
        }
        for(int i=n-1;i>=0 ;i--){
            while(st.size()!=0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res.set(i,-1);
                
            }else{
                res.set(i,st.peek());
            }
            st.push(arr[i]);
           
            
        }
        return res;
    }
}