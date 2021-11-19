package loops;

public class digits {
    public static void main(String[] args) {
        int num = 76765;
        int reminder=1;
        int i =0;
        while(reminder > 0){
            reminder = num%(10);
            num = num/10;
            i++;
            if (reminder != 0) {
                System.out.println(" ");
            }else{
                System.out.println("number of digits "+(i-1));
            }
        };
    }
}
