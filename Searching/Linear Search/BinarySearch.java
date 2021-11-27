public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -18, -14, -5, 0, 9, 12, 66, 123, 453, 500 };
        System.out.println(binarySearch(arr, 453));
        int[] arr2 = { 45, 23, 22, 9, 7, 6, 1, 0, -1, -5, -88 };
        System.out.println(orderAgnosticBS(arr2, 0));
    }

    // retiurn the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            // if target is less than middle element then the end will be mid -1
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;// if the mid element is the target then return mid
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or decending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
