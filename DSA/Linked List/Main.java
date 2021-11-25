public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        /*
         * list.insertFirst(5); list.insertFirst(6); list.insertFirst(2);
         * list.insertFirst(8); list.display(); list.insertAt(1, 3); list.display();
         * list.deleteFirst(); list.display(); list.insertLast(9); list.display();
         * list.deleteLast(); list.delete(2); // delet index starts from 0
         * list.display(); list.find(6);
         */

        DoublyLinkedList dList = new DoublyLinkedList();
        dList.insertFirst(5);
        dList.insertFirst(6);
        dList.insertFirst(7);
        dList.insertLast(4);
        dList.display();

    }
}