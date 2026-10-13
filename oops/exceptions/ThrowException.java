package exceptions;

import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter age:");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 0) {
            throw new Exception("not eligible to vote");
        } else {
            System.out.println("eligible to vote");
        }
    }
}