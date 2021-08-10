package arrays;

public class sumOfElements {
    public static void main(String[] args) {
        int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
       /* int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        System.out.println("Sum = " + sum);

        // searching an element
        int k = 8;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == k) {
                // System.out.println("element found at " + i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
       */
        // finding maximum element
        int maxNum1 = 0;
        int maxNum2 = 0;

        for (int i = 0; i < A.length; i++) {
            if (maxNum1 < A[i]) {
                maxNum2 = maxNum1;
                maxNum1 = A[i];

            } else if (maxNum2 < A[i]) {
                maxNum2 = A[i];
            }

        }
        System.out.println("Largest is " + maxNum1);
        System.out.println("second Largest is " + maxNum2);
    }
}
