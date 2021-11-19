package switchCase;

public class code1 {
    public static void main(String[] args) {
        String option = "SAVE";
        switch (option) {
            case "NEW":
                System.out.println("new");
                break;
            case "OPEN":
                System.out.println("open");
                break;
            case "SAVE":
                System.out.println("save");
                break;
            case "CLOSE":
                System.out.println("close");
                break;
            case "EXIT":
                System.out.println("exit");
                break;

            default:
                System.out.println("default");
                break;
        }
    }
}
