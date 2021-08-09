package loops;

public class forloop {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int fact = 1;
        for (int j = 0; j <= n; j++) {
            sum = sum + j;
        }
        System.out.println(sum);

        for (int i = n; i > 0; i--) {
            fact = fact*i;
        }
        System.out.println(fact);
    }

    
}
 