import java.util.ArrayList;

public class Stack {
    int size;
    int arr[];
    int top;

    Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return size - 1 == top;
    }

    public int peek() {
        if (this.isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public void push(int element) {
        if (!isFull()) {
            top++;
            arr[top] = element;
            System.out.println("Pushed element : " + element);
        } else {
            System.out.println("Stack is full now");
        }
    }

    public void pop(int element) {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element : " + arr[returnedTop]);
        } else {
            System.out.println("Stack is empty");
        }
    }
}

public class ArrayListStack {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void push(int x) {
        arrayList.add(x);
    }

    public int pop() {
        int res = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        return res;
    }

    public int peek() {
        return arrayList.get(arrayList.size() - 1);
    }
}

class StackUsingLinkedlist {

    // A linked list node
    private class Node {

        int data; // integer data
        Node link; // reference variable Node type
    }

    // create global top reference variable global
    Node top;

    // Constructor
    StackUsingLinkedlist() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(int x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();

        // initialize data into temp data field
        temp.data = x;

        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        top = (top).link;
    }

    public void display() {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.link;
            }
        }
    }
}