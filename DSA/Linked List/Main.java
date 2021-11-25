public class Main {
    // public static class Node {
    // int data;
    // Node next;
    // }

    // public static class LinkedList {
    // Node head;
    // Node tail;
    // int size;

    // void addFirst(int val) {
    // Node node = new Node();
    // node.data = val;
    // if (size == 0) {
    // head = tail = node;
    // node.next = null;
    // } else {
    // node.next = head.next;
    // head = node;
    // head.next = node;
    // }
    // size++;
    // }

    // void insertLast(int val) {
    // Node node = new Node();
    // node.data = val;
    // node.next = null;
    // if (size == 0) {
    // head = tail = node;
    // } else {
    // tail.next = node; // helps point last node to new node
    // tail = node; // tail arrow point to new node
    // }
    // size++;
    // }

    // void removeFirst() {
    // if (size == 0) {
    // System.out.println("list is empty");
    // } else {
    // head = head.next;
    // size--;
    // }

    // }

    // void display() {
    // Node temp = head;
    // while (temp != null) {
    // System.out.println(temp.next + " --> ");
    // temp = temp.next;
    // }

    // }

    // void size() {
    // System.out.println(size);
    // }
    // }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertLast(2);

    }
}