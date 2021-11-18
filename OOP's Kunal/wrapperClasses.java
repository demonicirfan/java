public class wrapperClasses {
    public static void main(String[] args) {
        final StudentClass Irfan = new StudentClass();
        Irfan.rollNumber = 33;
        Irfan.name = "Irfan";
        Irfan.numOfSubjects = 6;
    }
}

class StudentClass {
    int rollNumber;
    String name;
    int numOfSubjects;
}