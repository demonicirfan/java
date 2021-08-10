package arrays;

public class rotation {
    public static void main(String[] args) {
        int arr[] = { 4, 6, 7, 8, 9 };

        int temp = arr[0];
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            arr2[i] = arr[i + 1];
        }
        arr2[arr.length - 1] = temp;
        for (int i : arr2) {
            System.out.println(i);
        }

        // inserting an element into an array
        // i have to insert 5 at 3rd position
        int position = 3;
        int element = 5;
        int arr3[] = new int[arr.length + 1];
        for (int i = 0; i < position - 1; i++) {
            arr3[i] = arr[i];
        }
        arr3[position - 1] = element;
        for (int i = position; i <= arr.length; i++) {
            arr3[i] = arr[i - 1];
        }

    }
}
