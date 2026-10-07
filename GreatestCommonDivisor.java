import java.util.Scanner;

public class GreatestCommonDivisor {
    static int gcd(int number1, int number2) {
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        while (number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }

        return number1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println("GCD = " + gcd(number1, number2));
        input.close();
    }
}