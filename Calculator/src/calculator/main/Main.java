package calculator.main;

import java.util.Scanner;

import calculator.operations.Operations;

public class Main {

	public static void main(String[] args) {
//object to get number input
		Scanner realNum = new Scanner(System.in);
//object to get operation symbol input
		Scanner opSymbols = new Scanner(System.in);
//object for response
		Scanner moreCal = new Scanner(System.in);
//variable used to hold the 1st number
		String num1 = "";
//variable used to hold the operation character
		String operation = "";
//variable used to hold the 2nd number
		String num2 = "";

//Variables to hold the converted values.
		double decimalNum1 = 0.0;
		int integerNum1 = 0;
		double decimalNum2 = 0.0;
		int integerNum2 = 0;
		boolean again = false;

		while (again == false) {

//Converts string to either double or integer depending on a present decimal. w/ Try and Catch
			while (true) {
				try {
					// Instruction prompt
					System.out.println("Enter any real number below");
					// Used to the assign the variable created.
					num1 = realNum.nextLine();
					if (num1.contains(".")) {
						decimalNum1 = Double.parseDouble(num1);
						break;
					} else {
						integerNum1 = Integer.parseInt(num1);
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input, needs to be any real number.");
				}
			}

//Operation validation check
			while (true) {
				// Instruction prompt
				System.out.println("Enter any of the following valid symbols +,-,/, or *.");
				// Prompts for a operation symbol
				operation = opSymbols.nextLine();
				if (operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*")) {
					break;
				} else {
					System.out.println("Not Valid symbol");
				}
			}

//Converts string to either double or integer depending on a present decimal. w/ Try and Catch
			while (true) {
				System.out.println("Enter any real number below");
				num2 = realNum.nextLine();
				try {
					if (num2.contains(".")) {
						decimalNum2 = Double.parseDouble(num2);
						break;
					} else {
						integerNum2 = Integer.parseInt(num2);
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input, needs to be a number.");
				}
			}

//Calculation decision making. Will determine rather to display a double or integer.
			switch (operation) {
			case "+":
				if ((decimalNum1 != 0) && (decimalNum2 != 0)) {
					Operations.addition(decimalNum1, decimalNum2);
				} else if ((decimalNum1 < 0) || (decimalNum1 > 0)) {
					Operations.addition(decimalNum1, integerNum2);
				} else if ((decimalNum2 < 0) || (decimalNum2 > 0)) {
					Operations.addition(integerNum1, decimalNum2);
				} else {
					Operations.addition(integerNum1, integerNum2);
					break;
				}

			case "-":
				if ((decimalNum1 != 0) && (decimalNum2 != 0)) {
					Operations.subtraction(decimalNum1, decimalNum2);
				} else if ((decimalNum1 < 0) || (decimalNum1 > 0)) {
					Operations.subtraction(decimalNum1, integerNum2);
				} else if ((decimalNum2 < 0) || (decimalNum2 > 0)) {
					Operations.subtraction(integerNum1, decimalNum2);
				} else {
					Operations.subtraction(integerNum1, integerNum2);
					break;
				}

			case "/":
				if ((decimalNum1 != 0) && (decimalNum2 != 0)) {
					Operations.divide(decimalNum1, decimalNum2);
				} else if ((decimalNum1 < 0) || (decimalNum1 > 0)) {
					Operations.divide(decimalNum1, integerNum2);
				} else if ((decimalNum2 < 0) || (decimalNum2 > 0)) {
					Operations.divide(integerNum1, decimalNum2);
				} else {
					Operations.divide(integerNum1, integerNum2);
					break;
				}

			case "*":
				if ((decimalNum1 != 0) && (decimalNum2 != 0)) {
					Operations.multiply(decimalNum1, decimalNum2);
				} else if ((decimalNum1 < 0) || (decimalNum1 > 0)) {
					Operations.multiply(decimalNum1, integerNum2);
				} else if ((decimalNum2 < 0) || (decimalNum2 > 0)) {
					Operations.multiply(integerNum1, decimalNum2);
				} else {
					Operations.multiply(integerNum1, integerNum2);
					break;
				}
			}
			System.out.println("Would you like to perform another calculation? Y or N?");
			String response = moreCal.nextLine().toUpperCase();
			if (response.equals("Y")) {
				again = false;
			} else {
				again = true;
				System.out.print("Program closed");
			}
		}
		realNum.close();
		opSymbols.close();
		moreCal.close();
	}

}
