package circle1;

class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if (r >= 0)
            radius = r;
        else
            radius = 0;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

public class Circle1 {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.setRadius(5);

        Circle c2 = new Circle();
        c2.setRadius(3);

        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());

        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());

        System.out.println(c2.area());
        System.out.println(c2.perimeter());
        System.out.println(c2.circumference());
    }
}