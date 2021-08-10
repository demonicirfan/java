package loops;


public class reverse {
    public static void main(String[] args) {
        int num = 86765;
        int reminder = 1;
        int i = 0;
        while (reminder > 0) {
            reminder = num % (10);
            num = num / 10;
            i++;
            if (reminder != 0) {
                System.out.println(reminder);
            } else {
                System.out.println(" ");
            }
        }
    }
}
