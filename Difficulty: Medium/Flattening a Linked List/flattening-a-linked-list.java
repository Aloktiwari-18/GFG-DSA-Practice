/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}*/
class Solution {

        public Node flatten(Node head) {

            if (head == null) {
                return null;
            }

            PriorityQueue<Node> pq =
                new PriorityQueue<>((a, b) -> Integer.compare(a.data, b.data));

            // Har vertical list ka first node heap mein daalo
            Node temp = head;

            while (temp != null) {
                pq.add(temp);
                temp = temp.next;
            }

            Node dummy = new Node(0);
            Node curr = dummy;

            while (!pq.isEmpty()) {

                Node node = pq.poll();

                // Same bottom list ka next node
                if (node.bottom != null) {
                    pq.add(node.bottom);
                }

                curr.bottom = node;
                curr = curr.bottom;


                curr.next = null;
            }

            return dummy.bottom;
        }
    }