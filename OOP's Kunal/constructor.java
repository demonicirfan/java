public class constructor {
    public static void main(String[] args) {
        School school = new School();
        School publicSchool = new School(20, "public");
        System.out.println(publicSchool.numOfClasses);
    }
}

class School {
    int numOfClasses;
    String schoolName;

    boolean takeAdmission(String studentName) {
        boolean admissionTaken = true;
        return admissionTaken;
    }

    School(int num, String school) {
        this.numOfClasses = num;
        this.schoolName = school;
    }

    School() {
        this.numOfClasses = 10;
        this.schoolName = "St. Francis Convent School";
    }
}
