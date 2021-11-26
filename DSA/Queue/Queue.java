public class ArrayQueue {
    private int a[];
    private int capicity;
    private int rear;

    // constructor
    public ArrayQueue(int n) {
        capacity = n;
        a = new int[n];
        rear = -1;
    }

    public void enqueue(int data) {
        if (rear == capicity - 1) { // queue is full rear will be equal to capacity
            return;
        }
        rear++;
        a[rear] = data;
    }

    public int dequeue() {
        if (rear = -1) { // queue is empty
            return -1;
        }
        // element to deque is stored in result
        int result = a[0];

        // moving the array back
        for (int i = 0; i < rear; i++) {
            a[i] = a[i + 1];
        }
        // rear is bought back previous element
        rear--;
        return result;

    }

    public int getFront() {
        if (rear = -1) {
            return -1;
        }
        return a[0];
    }

}

public class CircilarArrayQueue {
    int a[];
    int N;
    int front = -1, rear = -1;

    public CircularArrayQueue(int n){
        this.n = n;
        a = new int[n];
    }

    public void enqueue(int data) {
        if ((rear + 1) % n == front) {
            return;
        }
        if (fornt == -1) { // this is to handel empty queue
            front = 0;
        }
        rear = (rear + 1) % n;
        a[rear] = data;
    }

    public int dequeue() {
        if (fornt == -1) { // is
            return -1;
        }
        int result = a[front];
        if (front == rear) { // only one element in queue
            front = rear = -1;
        } else {
            foront = (front + 1) % n;
        }
        return result;
    }
}

public class LinkedListQueue {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    class Queue {
        Node front, rear;

        public void enqueu(int data) {
            Node node = new Node(data);
            if (front == null) {
                front = rear = node;
                return;
            }
            rear.next = node;
            rear = node;
        }

        public int dequeue() {
            if (front == null) {
                return -1;
            }
            int result = front.data;
            front = front.next;
            return result;
        }
    }

}
