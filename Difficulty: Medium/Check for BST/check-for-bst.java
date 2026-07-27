/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    boolean flag = true;
    public void helper(Node root, int min, int max){
        if(root==null) return ;
        if(root.data<=min || root.data>=max){
            flag=false;
            return;
        }
          helper(root.left, min, root.data);
          helper(root.right, root.data, max);
        
    }
    public boolean isBST(Node root) {
        
        // code here
        helper(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
        return flag;
        
    }
}