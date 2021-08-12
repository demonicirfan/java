package methods;

public class prime {
    static String primeNum(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0) 
                return "not prime";
        }
        return "prime";
    }

    public static void main(String[] args) {
        int a = 56464564;
        System.out.println(primeNum(a));;
    }
}
