/*
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
    public Node insertPos(Node head, int pos, int val) {
        if(head==null){
            return new Node(val);
        }
        if(pos==1){
            Node newNode=new Node(val);
            newNode.next= head;
            return newNode;
        }
        // code here
        Node newNode= new Node(val);
        Node temp= head;
        int count=0;
        while(temp!=null){
            count++;
            if(count==pos-1){
                
               
                newNode.next=temp.next;
                temp.next=newNode;
                return head;
                
            }
            
            temp=temp.next;
        }
        return head;
    }
}