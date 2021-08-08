package formating;

public class formating {
    public static void main(String[] args) {
        // int x = 10;
        // float y =0.0012f;
        // char z = 'A';
        // String str="java programming";

        // System.out.printf("%1$d %1$d %1$d\n", x);
        // System.out.printf("%1$d %2$f %1$d\n", x, y);
        // System.out.printf("%1$d %2$f %3$s\n", x, y, str);

        // { FLAGS
        int a = -10;
        float b = 123.453563f;
        String str = "java";
        System.out.printf("%(5d\n", a);
        System.out.printf("%6.2f\n", b);
        System.out.printf("%20s\n", str);
    }
}
