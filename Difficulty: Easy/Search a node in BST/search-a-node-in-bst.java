/*
Definition for Node
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
    boolean find;
    public void helper(Node root, int key){
        if(root==null){
            return ;
        }
        if(root.data==key){
            find=true;
            
        }
        helper(root.left, key);
        helper(root.right, key);
        
    }
    public boolean search(Node root, int key) {
        
        helper(root, key);
        return find;
    }
    
}