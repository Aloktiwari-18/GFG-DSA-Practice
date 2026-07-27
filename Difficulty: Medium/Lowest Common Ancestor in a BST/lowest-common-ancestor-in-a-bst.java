/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        Node temp=root;
        while(temp!=null){
            if(temp.data >n1.data && temp.data>n2.data){
                temp=temp.left;
            }
            else if(temp.data<n1.data && temp.data<n2.data){
                 temp=temp.right;
             }
             else{
                 break;
             }
            
            }
            return temp;
        }
        
    }
