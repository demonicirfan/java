public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(2);
        list.insertFirst(8);
        list.display();
        list.insertAt(1, 3);
        list.display();

    }
}