public class constructor {
    public static void main(String[] args) {
        School school = new School();
        System.out.println("Admission taken = " + school.takeAdmission("irfan"));
    }
}

class School {
    int numOfClasses;
    String schoolName;

    boolean takeAdmission(String studentName) {
        boolean admissionTaken = true;
        return admissionTaken;
    }

    School() {
        this.numOfClasses = 10;
        this.schoolName = "St. Francis Convent School";
    }
}
