package basics;

import java.util.Scanner;

public class PowerOfNumber {
    static long power(int base, int exponent) {
        long result = 1;

        for (int count = 1; count <= exponent; count++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base (x): ");
        int base = input.nextInt();
        System.out.print("Enter the exponent (n, 0 or greater): ");
        int exponent = input.nextInt();

        if (exponent < 0) {
            System.out.println("Please enter a non-negative exponent.");
        } else {
            System.out.println(base + "^" + exponent + " = " + power(base, exponent));
        }

        input.close();
    }
}