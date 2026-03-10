// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    Node top;
    int size;
    

    public myStack() {
        top=null;
        size=0;
        
        // Initialize your data members
    }

    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
        
        // check if the stack is empty
    }

    public void push(int x) {
        Node temp= new Node (x);
        if(size==0){
            top= temp;
            
        }
        temp.next=top;
        
        top= temp;
        size++;
        // Adds an element x at the rear of the stack.
    }

    public void pop() {

        if(size==0){
            return ;
        }
        top= top.next;
        size--;
        
        // Removes the front element of the stack.
    }

    public int peek() {
        if(size==0){
            return -1;
        }
        return top.data;
        // Returns the front element of the stack.
        // If stack is empty, return -1.
    }

    public int size() {
        return size;
        // Returns the current size of the stack.
    }
}
