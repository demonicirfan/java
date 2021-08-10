package loops;

public class numberInWords {
    public static void main(String[] args) {
        int input = 1456000;
        int r = 0;
        String str = "";
        while (input > 0) {
            r = input % 10;
            input = input / 10;
            str = str + r;

        }
        System.out.println(str);
        char c;
        for (int i = str.length() - 1; i >= 0; i--) {
            c = str.charAt(i);
            switch (c) {
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
                case '0':
                    System.out.print("zero ");
                    break;

                default:
                    break;
            }
        }
    }

}
