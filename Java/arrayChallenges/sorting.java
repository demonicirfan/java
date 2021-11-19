package arrayChallenges;

public class sorting {
    public static void main(String[] args) {
        int A[] = { 3, 5, 9, 7, 6, 2, 4, 8 }; // A.len = 8
        int key;
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println("");
        //
        for (int j = 0; j < A.length-1; j++) {
            for (int i = 0; i < A.length-1; i++) {
                if (A[i] < A[i + 1]) {
                    key = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = key;
                }
            }
        }
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
