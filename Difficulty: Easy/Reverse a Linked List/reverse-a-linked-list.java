/* Structure of Linked List Node
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
    Node reverseList(Node head) {
        Stack<Node> st= new Stack<>();
        Node temp=head;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        Node newNode= new Node(0);
        Node dummy= newNode;
        while(st.size()>0){
            dummy.next=st.pop();
            dummy=dummy.next;
            dummy.next=null;
            
        }
        
        return newNode.next;
        // code here
        
    }
}