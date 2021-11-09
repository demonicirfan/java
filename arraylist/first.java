import java.util.ArrayList;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(123);
        // list.add(153);
        // list.add(15);
        // list.add(6);
        // list.add(7);
        // list.set(2, 555);
        // list.remove(15);
        
        for (int i = 0; i < 10; i++) {
            list.add(scn.nextInt());
        }

        System.out.println(list);

    }
}