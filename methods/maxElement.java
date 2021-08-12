package methods;

public class maxElement {
    static int max(int A[]) {
        // a[] = 2,5,6,7,2
        int key=0;
        for (int i = 1; i < A.length; i++) {
            if (A[i-1] > A[i]) {
                key = A[i-1];
            }
        }
        return key;
    }
    public static void main(String[] args) {
        int a[] = {2,5,6,7,2,88};
        System.out.println(max(a));
    }
}
