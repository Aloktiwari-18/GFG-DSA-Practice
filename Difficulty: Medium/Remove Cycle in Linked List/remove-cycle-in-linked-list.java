/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        // code here
        if(head==null || head.next==null){
            return ;
        }
        Node slow= head;
        Node fast=head;
        while(fast!=null &&  fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return ;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        while(fast.next!=slow){
            fast=fast.next;
        }
        fast.next=null;
        
    }
}