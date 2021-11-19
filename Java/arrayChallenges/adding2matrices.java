package arrayChallenges;

public class adding2matrices {
    public static void main(String[] args) {
        int A[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
        int B[][] = { { 1, 5, 2 }, { 6, 8, 4 }, { 3, 9, 7 } };
        int sum[][] = new int[A.length][A[0].length];

        // adding both arrays
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int[] x : sum) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }
    }
}
