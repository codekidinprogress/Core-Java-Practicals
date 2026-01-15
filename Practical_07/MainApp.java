package Practical_07;

import Practical_07.MessagePrinter;
import Practical_07.Calculator;
import Practical_07.Greeter;
public class MainApp {

	public static void main(String[] args) {
		MessagePrinter printer = new MessagePrinter();
		printer.printMessage();
		Calculator calc = new Calculator();
		System.out.println("Addition:" + calc.add(10, 5));
		System.out.println("Multiplication:" + calc.multiply(4, 3));
		Greeter greeter = new Greeter();
		greeter.greet("Imran");
	}

}

