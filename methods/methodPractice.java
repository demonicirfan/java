package methods;

public class methodPractice {
    static void change(int X[], int index, int value) {
        X[index] = value;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 5, 4, 8 };
        change(A, 3, 30);

        for (int i : A) {
            System.out.println(i);
        }
    }
}
