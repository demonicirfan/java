package student;

class StudentClass {
    public int roll;
    public String Course;
    public int m1, m2, m3;

    // methods
    public int total() {
        return m1 + m2 + m3;
    }

    public int average() {
        return total() / 3;
    }

    public String grade() {
        if (average() > 90) {
            return "A+";
        } else if (average() > 80) {
            return "A";
        } else if (average() > 70) {
            return "B+";
        } else {
            return "B";
        }
    }
}

public class StudentMain {
    public static void main(String[] args) {
        StudentClass s1= new StudentClass();
        s1.roll = 30;
        s1.Course = "medical";
        s1.m1 = 90;
        s1.m2 = 60;
        s1.m3 = 85;

        System.out.println(s1.grade());
    }
}
