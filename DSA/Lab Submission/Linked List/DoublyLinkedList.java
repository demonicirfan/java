public class DoublyLinkedList {
    private Node head;
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
        Node node = head;
        Node last = null;
        System.out.print("HEAD <=> ");

        while (node != null) {
            System.out.print(node.val + " <==> ");
            last = node;
            node = node.next;
        }
        System.out.println("TAIL");
        System.out.print("HEAD <=> ");
        while (last != null) {
            System.out.print(last.val + " <==> ");
            last = last.prev;
        }
        System.out.println("Start");

    }

    Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
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

    public void insertLast(int val) {
        Node node = new Node(val); // creating the last node
        Node last = head; // to traverse to the last array

        node.next = null; // bcz it will be the last node its next should be null

        if (head == null) { // if the head is null that means it is the only element or no element is there
            node.prev = null; // prev = null and val = value
            head = null; // head -> prev = null and val = value
            return; // end
        }
        while (last.next != null) { // go to the last element
            last = last.next;
        }
        last.next = node; // in last node store adress of new node
        node.prev = last;// in new node prev store the address or last node

    }

    public void insertAt(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
}
