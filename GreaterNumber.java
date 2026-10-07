import java.util.Scanner;

public class GreaterNumber {
    static int greater(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        }
        return number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println("Greater number = " + greater(number1, number2));
        input.close();
    }
}