package overloading;

public class sum {
    static int sumAll(int ...a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumAll(1,3,5,4,6,7));
    }
}
 