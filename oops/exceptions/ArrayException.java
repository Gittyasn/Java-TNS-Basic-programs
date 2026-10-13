package exceptions;

public class ArrayException {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(numbers[9]);
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index out of bounds");
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero");
        }
    }
}
