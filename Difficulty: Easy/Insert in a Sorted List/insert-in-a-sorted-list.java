/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node temp=head;
        Node dummy=new Node(0);
        Node d= dummy;
        while(temp!=null){
            while(temp!=null && temp.data<=key){
                d.next=temp;
                d=d.next;
                temp=temp.next;
            } 
            d.next=new Node(key);
            d=d.next;
            while(temp!=null){
                d.next=temp;
                d=d.next;
                temp=temp.next;
            }
            
            
        }
        return dummy.next;
    }
}