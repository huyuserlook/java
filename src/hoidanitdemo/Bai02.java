package hoidanitdemo;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println("nhập chiều rộng hình chữ nhật: ");
		Scanner scanner = new Scanner(System.in);
		int rong = scanner.nextInt();

		System.out.println("nhập chiều dài hình chữ nhật: ");
		int dai = scanner.nextInt();

		int chuVi = (rong + dai) * 2;
		int dienTich = (rong * dai);
		int canhMin = Math.min(dai, rong);

		System.out.println("chu vi: " + chuVi);
		System.out.println("diện tích: " + dienTich);
		System.out.println("cạnh min: " + canhMin);
		scanner.close();

	}

}
