package Practical_11;

import java.util.Scanner;
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			//Talking input from user
			System.out.println("Enter the numerator:");
			int numerator = scanner.nextInt();
			
			System.out.println("Enter the denominator:");
			int denominator = scanner.nextInt();
			
			//Division operation
			int result = numerator/denominator;
			System.out.println("Result:" + result);
		}
		catch(ArithmeticException e){
			System.out.println("Error: cannot divide by zero.");
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("Error: Please enter valid integers.");
		}
		finally {
			System.out.println("Program finished Resources closed.");
			scanner.close();//Clean up the resource
		}
	}
}



