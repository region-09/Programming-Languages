package ex2.a;

import ex2.a.*;

public class Main {
    public static void main(String[] args) {
        Point[] arr = new Point[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter x: ");
            double x = Double.parseDouble(System.console().readLine());
            System.out.println("Enter y: ");
            double y = Double.parseDouble(System.console().readLine());

            arr[i] = new Point(x,y);
        }

        double center_x = 0, center_y = 0;
        for (int i = 0; i < 3; i++) {
            center_x += arr[i].getX();
            center_y += arr[i].getY();
        }
        center_x /= arr.length;
        center_y /= arr.length;

        Point center = new Point(center_x, center_y);
        System.out.println("center of mass: " + center);
    }
}