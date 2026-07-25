/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node deleteAtPosition(Node head, int k) {
        // code here
        if(head==null) return null;
        if(k==1){
            if(head.next==null) return null;
            head=head.next;
            return head;
        }
        int count=0;
        Node prev=null;
        Node temp= head;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}