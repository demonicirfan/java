public class Search {
    public static void main(String[] args) {
        SearchInArray searchArray = new SearchInArray();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(searchArray.existPosition(arr, 3));
        System.out.println(searchArray.existsOrNot(arr, 3));

        SearchInString searchString = new SearchInString();
        String str = "Irfan";
        System.out.println(searchString.existPosition(str, 'r'));
        System.out.println(searchString.existsOrNot(str, 'r'));

    }

}

class SearchInString {
    String name;

    boolean existsOrNot(String str, int target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    int existPosition(String str, int target) {
        char[] arr = str.toCharArray();
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;

    }
}

class SearchInArray {
    int[] arr;

    boolean existsOrNot(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }

    int existPosition(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;

    }

    int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
