package area;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float base, height, area;
        System.out.println("Enter Base and Height ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = base * height / 2;

        System.out.println("Area of the tringale is " + area);
        sc.close();
    }
}
