import java.util.*;

class Overload {
    double area;

    void calcArea(double a) {
        area = 3.14 * a * a;
        System.out.println("The area of the circle is : " + area);
    }

    void calcArea(double a, double b) {
        area = a * b;
        System.out.println("The area of the rectangle is : " + area);
    }

    void calcArea(float a, float b) {
        area = 0.5 * a * b;
        System.out.println("The area of the triangle is : " + area);
    }
}

class Main {
    public static void main(String args[]) {
        Overload o = new Overload();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double r = sc.nextDouble();
        o.calcArea(r);
        System.out.print("Enter the length of the rectangle : ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle : ");
        double b = sc.nextDouble();
        o.calcArea(l, b);
        System.out.print("Enter the breadth of the triangle : ");
        float c = sc.nextFloat();
        System.out.print("Enter the height of the triangle : ");
        float h = sc.nextFloat();
        o.calcArea(c, h);
    }
}