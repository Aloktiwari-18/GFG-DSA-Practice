/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head){
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            Node nextNode= temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextNode;
        }
        return prev;
    }
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node newhead1= reverse(head1);
        Node newhead2= reverse(head2);
        
        Node temp1= newhead1;
        Node temp2= newhead2;
        Node dummy= new Node(0);
        Node d=dummy;
        
        int carry=0;
        while(temp1 != null || temp2 != null || carry != 0){

            int x = (temp1 != null) ? temp1.data : 0;
            int y = (temp2 != null) ? temp2.data : 0;
        
            int sum = x + y + carry;
        
            carry = sum / 10;
        
            d.next = new Node(sum % 10);
            d = d.next;
        
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
}
        Node ans=reverse(dummy.next);
        while(ans.data==0 && ans.next!=null){
            ans=ans.next;
            
        }
        
        
        return ans;
        
    }
}