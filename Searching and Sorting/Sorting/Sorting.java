import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();
        InsertionSort is = new InsertionSort();
        int[] arr1 = { 3, 6, 2, 9, 8, 11, 4, 22, 7, 1, 43, 0 };
        int[] arr2 = { 1, 23, 60, 200, 945, 1100 };
        int[] arr3 = { 8, 6 };

        ss.selection(arr3);
        bs.bubble(arr3);
        is.insertion(arr3);
    }
}

class BubbleSort {
    // sinking sort or exchange sort
    // with the first parse the largest element came in the end
    boolean swapped = false;

    void bubble(int[] arr) {
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap is the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if we did not swap for a particular value or i, it means the array is sorted
            // hence stop the program
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

class SelectionSort {
    void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the maximum item in the remaining array and swap with correct index
            int last = arr.length - i - 1;// last will reduce every time loop runs
            int maxIndex = getMaxIndex(arr, 0, last);// this will give the max element in the range 0 to new last

            swap(arr, maxIndex, last);
        }
        System.out.println(Arrays.toString(arr));
    }

    private int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

class InsertionSort {
    SelectionSort ss = new SelectionSort();

    void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    ss.swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

class CyclicSort {

}

class MergeSort {

}

class QuickSort {

}
