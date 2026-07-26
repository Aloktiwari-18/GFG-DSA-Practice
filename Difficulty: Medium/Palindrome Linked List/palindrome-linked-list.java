/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node  reverse(Node head){
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            Node front= temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
            
        }
        return prev;
        
    }
    public boolean isPalindrome(Node head) {
        // code here
        Node temp=head;
        Node slow= head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        
        Node newNode =reverse(slow.next);
        Node second=newNode;
        Node first=head;
        while(second!=null){
            if(first.data!=second.data){
                reverse(newNode);
                return false;
            }
            first=first.next;
            second=second.next;
            
        }
        reverse(newNode);
        return true;
    }
}