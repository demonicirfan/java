import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        SearchInArray searchArray = new SearchInArray();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(searchArray.existPosition(arr, 3));
        System.out.println(searchArray.existsOrNot(arr, 3));

        SearchInString searchString = new SearchInString();
        String str = "Irfan";
        System.out.println(searchString.existPosition(str, 'r'));
        System.out.println(searchString.existsOrNot(str, 'r'));

        SearchIn2DArray searchIn2D = new SearchIn2DArray();
        // @formatter:off
        int[][] arr2D = { 
          { 23, 4, 1 }, 
          { 18, 12, 3, 9 }, 
          { 78, 5, 6 }, 
          { 13, 5, 88, 97, 0, 3 }, 
        };
        // @formatter:on
        System.out.println(Arrays.toString(searchIn2D.existsPosition(arr2D, 5)));
        LinearSearchWithReccurssion lSwithArr = new LinearSearchWithReccurssion();
        int[] arr2 = { 1, 2, 3, 4, 4, 5 };
        lSwithArr.LSwithRecurssionAllIndex(arr2, 4, 0, list);
    }

}

class SearchInString {

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

    // do not write in notebook
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

class SearchIn2DArray {

    int[] existsPosition(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}

class LinearSearchWithReccurssion {
    boolean LSwithRecurssion(int[] arr, int target, int index) {
        // in every call we will check if the element we are searching for is equal to
        // that index
        if (index == arr.length) { // when we react end then return false
            return false;
        }
        // either the current element should be equal to the target or in the next
        // reciurssion call
        return arr[index] == target || LSwithRecurssion(arr, target, index + 1);
    }

    int LSwithRecurssionIndex(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return LSwithRecurssion(arr, target, index - 1);
        }
    }

    ArrayList LSwithRecurssionAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index); // when the element is found add it to the array list
        }
        return LSwithRecurssion(arr, target, index - 1);
    }
}
