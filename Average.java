import java.util.Scanner;

class Average {
	static void printAverage(double number1, double number2, double number3) {
		double average = (number1 + number2 + number3) / 3;
		System.out.println("Average = " + average);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		printAverage(number1, number2, number3);
		input.close();
	}
}
