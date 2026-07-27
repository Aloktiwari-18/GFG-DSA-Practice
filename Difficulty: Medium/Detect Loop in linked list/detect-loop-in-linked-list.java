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
    public boolean detectLoop(Node head) {
        // code here
        HashSet<Node> set= new HashSet<>();
        Node temp=head;
        while(temp!=null){
            if(set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp=temp.next;
        }
        return false;
    }
}