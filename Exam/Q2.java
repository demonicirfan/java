import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = { 1, 12, 5, 26, 7, 14, 3, 7, 2 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static int part(int array[], int left, int right) {
        int i = left, j = right;
        int temp;
        int pivot = array[(left + right) / 2];
        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

        }
        return i;
    }

    static void quickSort(int arr[], int left, int right) {
        int index = part(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }
}