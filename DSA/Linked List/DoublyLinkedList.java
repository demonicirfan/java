public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.val = value;
        }

        public Node(int value, Node next) {
            this.val = value;
            this.next = next;
        }

        public Node(int value, Node next, Node prev) {
            this.val = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public Node get(int index) {
        Node referenceNode = head;
        for (int i = 0; i < index; i++) {
            referenceNode = referenceNode.next;
        }
        return referenceNode;
    }

    public void display() {
        Node temp = head;
        System.out.print("HEAD <=> ");

        while (temp != null) {
            System.out.print(temp.val + " <=> ");
            temp = temp.next;
        }
        System.out.println("TAIL");

    }

    // #------------- INSERTING AN ELEMENT-----------------

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        // head.prev wil help change previous value stored in node to the new enterede
        // node behind the preexisting node
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

}
