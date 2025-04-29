package calculator.operations;

public class Operations {
	// Method overloading to allow flexibility when adding different numbers
	// together rather double or integer.
	public static void addition(double num1, double num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public static void addition(double num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public static void addition(int num1, double num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public static void addition(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

	// Method overloading to allow flexibility when subtracting different numbers
	// together rather double or integer.
	public static void subtraction(double num1, double num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}

	public static void subtraction(double num1, int num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}

	public static void subtraction(int num1, double num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}

	public static void subtraction(int num1, int num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}

	// Method overloading to allow flexibility when multiplying different numbers
	// together rather double or integer.
	public static void multiply(double num1, double num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}

	public static void multiply(double num1, int num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}

	public static void multiply(int num1, double num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}

	public static void multiply(int num1, int num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}

	// Method overloading to allow flexibility when dividing different numbers
	// together rather double or integer.
	public static void divide(double num1, double num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}

	public static void divide(double num1, int num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}

	public static void divide(int num1, double num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}

	public static void divide(int num1, int num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
}
