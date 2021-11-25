public class Main {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp; // tail.next
                tail = temp; // arrow
            }
            size++;
        }

        void removeFirst() {

        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println();
        }

        void size() {
            System.out.println(size);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(3);
        list.addLast(6);
        list.addLast(5);
        list.size();
    }
}