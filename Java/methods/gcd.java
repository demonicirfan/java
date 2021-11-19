package methods;

public class gcd {
    static int gretestCommonDevisor(int a, int b) {
        int key, x = 0, y = 0, i, j;
        if (a > b)
            key = b;
        else
            key = a;

        for (i = key; i > 1; i--) {
            x = a % i;
            for (j = key; j > 1; j--) {
                y = b % j;
                if (x == 0 && y == 0) {
                    if (i == j) {
                        return j;
                    }
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(gretestCommonDevisor(30, 24));
    }
}
