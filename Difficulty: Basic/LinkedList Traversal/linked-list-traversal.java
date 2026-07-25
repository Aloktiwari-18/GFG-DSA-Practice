/*
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/

class Solution {
    void printList(Node head) {
        // code here
        while(head!=null){
            System.out.print(head.data + " ");
            
           
            head=head.next;
            
        }
        
        
    }
}