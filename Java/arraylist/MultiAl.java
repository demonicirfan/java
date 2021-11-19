import java.util.*;

public class MultiAl {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initializing
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(scn.nextInt());
            }
        }
        System.out.println(list);
    }
}
