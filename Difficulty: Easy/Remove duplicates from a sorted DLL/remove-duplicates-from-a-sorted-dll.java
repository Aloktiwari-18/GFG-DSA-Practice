/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        HashSet<Integer> set= new HashSet<>();
        Node temp=head;
        while(temp!=null){
            Node nextNode= temp.next;
            if(set.contains(temp.data)){
                
                if(temp.prev!=null){
                    temp.prev.next=temp.next;
                }
                if(temp.next!=null){
                    temp.next.prev=temp.prev;
                }
            }else{
                set.add(temp.data);
            }
            
            temp=nextNode;
        }
        return head;
        
        
    }
}