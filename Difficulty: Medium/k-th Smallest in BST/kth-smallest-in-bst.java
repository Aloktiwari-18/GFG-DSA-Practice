/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> arr= new ArrayList<>();
    public void inorder(Node root, ArrayList<Integer> arr){
        if(root==null){
            return ;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
    public int kthSmallest(Node root, int k) {
        // code here
        inorder(root,arr);
        int ans=-1;
        if(arr.size()<k){
            return -1;
        }
        for(int i=0;i<k;i++){
            ans=arr.get(i);
        }
        return ans;
    }
}