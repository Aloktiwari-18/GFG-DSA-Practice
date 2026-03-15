class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Queue<Integer> q1= new LinkedList<>();
        int n= q.size();
        if (k > n || k <= 0) {
            return q;
        }
        // code here
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
            
        }
        while(!st.isEmpty()){
            q1.add(st.pop());
        }
        for(int i=0;i<n-k;i++){
            q1.add(q.remove());
        }
        return q1;
    }
}