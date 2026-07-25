/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        if(head==null  || head.next==null) return null;
        // code here
        Node temp= head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
        
    }
}