
/*
* (i) Given an array, for each element find the value of the nearest element to the right which
* is having a frequency greater than as that of the current element. If there does not exist an
* answer for a position, then make the value -1. Implement an efficient algorithm for this task.
* Input: a[] = [1, 1, 2, 3, 4, 2, 1]
* Output: [-1, -1, 1, 2, 2, 1, -1]
*/
import java.util.Stack;

public class Q1 {
    public static void main(String args[]) {

        int[] a = { 1, 1, 2, 3, 4, 2, 1 };
        int length = 7;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int[] freq = new int[max + 1];

        for (int i = 0; i < max + 1; i++)
            freq[i] = 0;

        for (int i = 0; i < length; i++) {
            freq[a[i]]++;
        }

        NextGreaterFrequencey(a, length, freq);
    }

    static void NextGreaterFrequencey(int[] a, int n, int[] freq) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = 0;

        for (int i = 1; i < n; i++) {

            if (freq[a[stack.peek()]] > freq[a[i]])
                stack.push(i);
            else {

                while (freq[a[stack.peek()]] < freq[a[i]] && stack.size() > 0) {
                    res[stack.peek()] = a[i];
                    stack.pop();
                }
                stack.push(i);
            }
        }

        while (stack.size() > 0) {
            res[stack.peek()] = -1;
            stack.pop();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
