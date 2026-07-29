/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int count=0;
        Node temp= head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int l= count-k+1;
        temp=head;
        int n=0;
        while(temp!=null){
            n++;
            if(n==l){
                return temp.data;
            }
            temp=temp.next;
            
        }
        return -1;
        
        
    }
}