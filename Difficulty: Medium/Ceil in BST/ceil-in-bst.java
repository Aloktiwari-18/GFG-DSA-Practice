/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int ceil=-1;
    int findCeil(Node root, int x) {
        if(root==null) return 0;
        
        // code here
        if(root.data==x) {
            ceil= root.data;
            return ceil;
        }
        if(root.data>x){
            ceil= root.data;
            findCeil(root.left,x) ;
        }
        if(root.data<x){
            findCeil(root.right,x) ;
        }
        return ceil;
    }
}