/*
Definition for Node
class Node{
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int maxi;
    public int maxPath(Node root){
        if(root==null) return 0;
        int left= maxPath(root.left);
        int right= maxPath(root.right);
        maxi= Math.max(maxi, root.data+Math.max(0,left)+Math.max(0,right));
        return Math.max(0,(root.data + Math.max(left, right)));
    }
    void helper(Node root){
        if(root==null) return;
        maxPath(root);
        helper(root.left);
        helper(root.right);
    }
    int findMaxSum(Node root) {
        maxi= Integer.MIN_VALUE;
        helper(root);
        return maxi;
    }
}