package Inheritance;

public class Box {

    public double l;
    public double h;
    public double w;

    public Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    public Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    public Box(double l, double h, double w) {
        this.h = l;
        this.l = h;
        this.w = w;
    }

    public Box(Box old) {
        this.h = old.l;
        this.l = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println(" running the box ");
    }
}