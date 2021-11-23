public class oops1 {

    public static void main(String[] args) {
        Student kunal = new Student();
        kunal.roll = 50;
        kunal.name = "kunall";
        kunal.marks = 50.5f;
        System.out.println(kunal);
        System.out.println(kunal.roll);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

    }
}

class Student {
    int roll;
    String name;
    float marks;
}
