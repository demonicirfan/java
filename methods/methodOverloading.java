package methods;

public class methodOverloading {
    static int max(int x, int y)
    {
        return x>y?x:y;
    }
    static float max(float x, float y)
    {
        return x>y?x:y;
    }
    static int max(int x, int y, int z)
    {
        if (x>y) {
            if (x>z) {
                return x;
            }
        } else {
            if (y>z) {
                return y;
            }
        }
        return z;
    }

    public static void main(String[] args) {
        System.out.println(max(10.5f, 5.5f));
        System.out.println(max(10, 5));
        System.out.println(max(10, 5, 20));
    }
}
