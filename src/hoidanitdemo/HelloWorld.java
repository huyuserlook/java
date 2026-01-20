package hoidanitdemo;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("first number: " + Math.sqrt(81));
		int firstNmber = scanner.nextInt();
		System.out.println("Second number:");
		int secondNumber = scanner.nextInt();
		System.out.println("min= " + Math.min(firstNmber, secondNumber));
		scanner.close();

	}

}
