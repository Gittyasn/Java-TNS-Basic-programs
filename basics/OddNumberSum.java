package basics;

import java.util.Scanner;

public class OddNumberSum {
    static void printOddSum(int n) {
        int sum = 0;

        for (int number = 1; number <= n; number += 2) {
            sum += number;
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        printOddSum(n);

        input.close();
    }
}