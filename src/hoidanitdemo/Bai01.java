package hoidanitdemo;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập tên");
		String name = scanner.nextLine();
		System.out.println("nhập điểm: ");
		int score = scanner.nextInt();
		System.out.println(name + " có điểm: " + score);

		scanner.close();

	}

}
