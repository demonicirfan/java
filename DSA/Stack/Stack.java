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
