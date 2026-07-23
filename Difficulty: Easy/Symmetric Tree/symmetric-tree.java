/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean sym(Node left, Node right){
        if(left==null && right==null) return true;
        
        if(left==null || right==null) return false;
        
        if(left.data!=right.data) return false;
        
        return sym(left.left, right.right) && sym(left.right, right.left);
       
        
    }
    
    public boolean isSymmetric(Node root) {
        // code here
    
        if(root==null) return true;
        return sym(root.left, root.right); 
        
    }
}