package basics;

import java.util.Scanner;

public class CircleCircumference {
    static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        System.out.println("Circumference = " + circumference(radius));
        input.close();
    }
}