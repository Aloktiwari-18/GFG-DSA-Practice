/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        Node temp= head;
        int count=0;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=temp.next;
                
                count=0;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
        
    }
}