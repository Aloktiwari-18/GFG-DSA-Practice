/* Structure of Doubly Linked List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node newNode= new Node(x);
        int count=-1;
        Node temp= head;
        while(temp!=null){
            count++;
            
            if(count==p){
                if(temp.next==null){
                    temp.next=newNode;
                    newNode.prev=temp;
                    
                }
                else{
                    newNode.next=temp.next;
                    temp.next.prev=newNode;
                    temp.next=newNode;
                    newNode.prev=temp;
                   
                }
                
            }
            
            temp=temp.next;
        }
        
        return head;
        
    }
}