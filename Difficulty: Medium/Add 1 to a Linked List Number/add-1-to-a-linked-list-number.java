/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node reverse(Node head){
        Node prev=null;
        Node temp= head;
        while(temp!=null){
            Node next= temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
        
    }
    public Node addOne(Node head) {
        if(head==null) return new Node(1);
        // code here.
         head = reverse(head);
        Node temp=head;
        int carry=1;
        Node res= new Node(0);
        Node ans=res;
        while(temp!=null || carry!=0){
            int num=carry;
            if(temp!=null){
                num+=temp.data;
            }
            carry= num/10;
            int rem= num%10;
            ans.next= new Node(rem);
            ans=ans.next;
            if(temp!=null) {
                temp=temp.next;
            }
            
        }
       return reverse(res.next);
       
        
        
    }
}