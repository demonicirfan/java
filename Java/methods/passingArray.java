package methods;

public class passingArray {
    static void update(int A[]) {
        A[0] = 25;
    }

    String userName(String email) {
        int a = email.indexOf('@');
        String name = email.substring(0,a);
        return name;
    }

    public static void main(String[] args) {
        int A[] = { 1, 4, 5, 6, 3 };
        update(A);
        System.out.println(A[0]);
        for (int i : A) {
            System.out.print(i + " ");
        }
    }

}
// when an array is passed then the array is changed bcz it is passed as a
// refrence
