/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    int count=0;
    public int solve(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return solve(root.left)+solve(root.right);
        
    }
    
    int countLeaves(Node node) {
        
        return solve(node);
        
        // Your code
    }
}