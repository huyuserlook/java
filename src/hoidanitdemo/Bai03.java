package hoidanitdemo;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập vào tax: ");
		int tax = scanner.nextInt();
		if (tax < 10) {
			System.out.println("không đóng thuế");
		} else if (10 <= tax && tax <= 15) {
			System.out.println("thuế 10%");
		} else if (15 <= tax && tax <= 30) {
			System.out.println("thuế 20%");
		} else {
			System.out.println("thuế 50%");
		}
		scanner.close();

	}

}
