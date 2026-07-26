/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
       Node evendum=new Node(0);
       Node odddum=new Node (0);
       Node even = evendum;
       Node odd= odddum;
       Node temp=head;
       while(temp!=null){
           if(temp.data%2==0){
               even.next=temp;
               even=even.next;
           }else{
               odd.next=temp;
               odd=odd.next;
           }
           temp=temp.next;
           
       }
       even.next=odddum.next;
       odd.next=null;
       return evendum.next;
        
    }
}