class Queue {
    private static int front, rear, capacity;
    private static int queue[];

    Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    static void queueEnqueue(int data) {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        }

        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    static void queueDequeue() {
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        }

        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
        return;
    }

    static void queueDisplay() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    static void queueFront() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }
}

public class Queue2 {

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.queueDisplay();
        queue.queueEnqueue(20);
        queue.queueEnqueue(30);
        queue.queueEnqueue(40);
        queue.queueEnqueue(50);
        queue.queueDisplay();
        queue.queueEnqueue(60);
        queue.queueDisplay();
        queue.queueDequeue();
        queue.queueDequeue();
        System.out.printf("\n\nafter two node deletion\n\n");
        queue.queueDisplay();
        queue.queueFront();
    }
}
