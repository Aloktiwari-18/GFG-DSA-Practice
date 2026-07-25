/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int floor=-1;
    public int helper(Node root, int k){
        if(root==null) return 0;
        if(root.data==k){
            floor=root.data;
            return floor;
        }
        if(root.data>k){
            helper(root.left,k);
        }
        else {
            floor=root.data;
           helper(root.right,k);
        }
        return floor;
    }
    public int findMaxFork(Node root, int k) {
        return helper(root, k);
        // code here.
    }
}