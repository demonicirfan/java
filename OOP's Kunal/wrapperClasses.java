public class wrapperClasses {
    public static void main(String[] args) {
        final StudentClass Irfan = new StudentClass();
        Irfan.rollNumber = 33;
        Irfan.name = "Irfan";
        Irfan.numOfSubjects = 6;
        System.out.println(Irfan.addmission(true));

    }
}

class StudentClass {
    int rollNumber;
    String name;
    int numOfSubjects;

    static boolean addmission(boolean fees) {
        if (fees == true) {
            return true;
        } else {
            return false;
        }
    }
}