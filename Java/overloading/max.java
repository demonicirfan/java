package overloading;

public class max {
    static int maximum(int... A) {
        if (A.length == 0)
            return Integer.MIN_VALUE;
        int maximum = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > maximum)
                maximum = A[i];

        }
        return maximum;
    }

    public static void main(String[] args) {

        System.out.println(maximum(new int[] { 2, 5, 6, 7, 2, 88 }));
    }
}
