package basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
        } else {
            int first = 0;
            int second = 1;

            for (int count = 1; count <= terms; count++) {
                System.out.print(first);
                if (count < terms) {
                    System.out.print(" ");
                }

                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }

        input.close();
    }
}