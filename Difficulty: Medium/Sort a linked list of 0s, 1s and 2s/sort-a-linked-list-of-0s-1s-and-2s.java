/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node oneH= new Node(0);
        Node twoH= new Node(0);
        Node zeroH= new Node(0);
        Node z=zeroH;
        Node o=oneH;
        Node t=twoH;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                z.next=temp;
                z=z.next;
                
            }
           else if(temp.data==1){
                o.next=temp;
                o=o.next;
                
            }
            else{
                t.next=temp;
                t=t.next;
                
            }
            temp=temp.next;
            
        }
        z.next= (oneH.next!=null)? oneH.next:twoH.next;
        o.next=twoH.next;
        t.next=null;
        
        return (zeroH.next!=null)? zeroH.next :(oneH.next!=null) ? oneH.next:twoH.next;
        
       
        
    }
}