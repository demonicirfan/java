package arrayChallenges;

public class multiplying2arrays {
    public static void main(String[] args) {
        int A[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
        int B[][] = { { 1, 5, 2 }, { 6, 8, 4 }, { 3, 9, 7 } };
        int mul[][] = new int[3][3];
        int sum[][] = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                for (int k = 0; k < B[0].length; k++) {
                    sum[i][k] = A[i][k] * B[k][j];
                }
                mul[i][j] = sum[i][0]+sum[i][1]+sum[i][2];
            }
        }
        for (int[] x : mul) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }
    }
}
// A=> \ a11 = 3, a12 = 5\ B => \ b11 = 1, b12 = 5\
// \ a21 = 7, a22 = 6\ \ b21 = 6, b22 = 8\
//answer
//  60  136	89
//	49	101	52
//	37	89	55