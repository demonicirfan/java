package methods;

public class maxElement {
    static int maximum(int A[]) {
        
        int key = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                key = A[i];
            } else {
                key = A[i - 1];
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int a[]={ 2, 5, 6, 7, 2, 88 };
        System.out.println(maximum(a));
    }
}
