/*
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
*/
class Solution {
    int floor=-1;
    public int findFloor(Node root, int x) {
        if(root==null) return 0;
        
        if(root.data==x){
            floor= root.data;
            return floor;
        }
        if(root.data<x){
            floor= root.data;
            findFloor(root.right,x);
            
        }
        if(root.data>x){
            findFloor(root.left, x);
        }
        return floor;
        // code here
        
    }
}
