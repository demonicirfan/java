public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -18, -14, -5, 0, 9, 12, 66, 123, 453, 500 };
        System.out.println(binarySearch(arr, 9));
    }

    // retiurn the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
