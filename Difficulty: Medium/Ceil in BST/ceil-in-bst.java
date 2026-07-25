/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int ceil=-1;
    public int helper(Node root, int x){
        if(root==null)return 0;
        if(root.data==x){
            ceil= root.data;
            return ceil;
        }
        if(root.data>x){
            ceil=root.data;
            helper(root.left, x);
        }
        if(root.data<x){
          helper(root.right, x);
        }
        return ceil;
        
    }
    int findCeil(Node root, int x) {
        // code here
   return  helper(root, x);
    
    }
}