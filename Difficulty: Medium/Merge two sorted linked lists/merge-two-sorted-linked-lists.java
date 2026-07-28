/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        if(head1==null) return head2;
        if(head2==null) return head1;
        // code here
        Node dummy=new Node(0);
        Node d=dummy;
        Node temp1= head1;
        Node temp2= head2;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                d.next=temp1;
                temp1=temp1.next;
                d=d.next;
            }
            else{
                d.next=temp2;
                
                d=d.next;
                temp2=temp2.next;
            }
            
        }
        while(temp1!=null){
            d.next=temp1;
            d=d.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            d.next=temp2;
            d=d.next;
            temp2=temp2.next;
        }
        return dummy.next;
        
    }
}