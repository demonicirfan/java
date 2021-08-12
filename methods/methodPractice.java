package methods;

public class methodPractice {
    static void change(int X[], int index, int value) {
        X[index] = value;
    }

    static void change2(int x, int value) {
        x = value;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 5, 4, 8 };
        change(A, 3, 30);

        for (int i : A) {
            System.out.print(i + " ");
        }

        var x = 10;
        change2(x, 20);
        System.out.println("value of premitive " + x);
    }
}

// when you pass premitive there values are passed and when you pass objects
// there references are passed
