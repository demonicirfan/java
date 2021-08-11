package arrays;

public class twoDarray {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        int arr1[][] = { { 1, 2, 3 }, { 2, 6, 7 }, { 1, 7, 3 } };
        int arr2[][];
        arr2 = new int[5][5];
        int[][] arr3 = new int[5][5];
        int[] arr4[];

        int[] arr5, arr6[];
        arr5 = new int[5];
        arr6 = new int[6][6];

        for (int x[] : arr) {
            for (int y : x) {
                System.out.println(y);
            }
        }
        for (int x[] : arr1) {
            for (int y : x) {
                System.out.println(y);
            }
        }

        for (int x[] : arr2) {
            for (int y : x) {
                System.out.println(y);
            }
        }
        for (int x[] : arr3) {
            for (int y : x) {
                System.out.println(y);
            }
        }
        for (int x[] : arr6) {
            for (int y : x) {
                System.out.println(y);
            }
        }
    }
}
