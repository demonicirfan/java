package arrays;

public class twoDarray {
    public static void main(String[] args) {
        //int arr[][] = new int[5][5];
        int B[][] = { { 1, 2, 3 }, { 2, 6, 7 }, { 1, 7, 3 } };
        // int arr2[][];
        // arr2 = new int[5][5];
        // int[][] arr3 = new int[5][5];
        // int[] arr4[];

        // int[] arr5, arr6[];
        // arr5 = new int[5];
        // arr6 = new int[6][6];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
