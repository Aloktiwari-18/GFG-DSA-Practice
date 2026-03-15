// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {

    Node head;
    Node tail;
    int size;

    public myQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int x) {

        Node temp = new Node(x);

        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    public void dequeue() {

        if (head == null) return;

        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
    }

    public int getFront() {

        if (head == null) return -1;

        return head.data;
    }

    public int size() {
        return size;
    }
}