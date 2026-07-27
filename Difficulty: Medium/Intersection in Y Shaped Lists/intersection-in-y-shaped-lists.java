/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    Node ans;
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        int count1=0;
        int count2=0;
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null){
            count1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            count2++;
            temp2=temp2.next;
        }
        int diff= Math.abs(count1-count2);
        temp1=head1;
        temp2=head2;
        if(count1>count2){
            while(diff>0){
                temp1=temp1.next;
                diff--;
            }
        }
        if(count2>count1){
            while(diff>0){
                temp2=temp2.next;
                diff--;
            }
        }
        
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            if(temp1!=null){
                temp1=temp1.next;
            }
            if(temp2!=null){
                temp2=temp2.next;
            }
        }
        return null;
    }
}