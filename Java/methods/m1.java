package methods;

public class m1 {
    static int max(int a, int b)
    {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        int x=0, y =4;
        System.out.println(max(x,y));
    }
}
