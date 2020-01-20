package lv.jak.bujaks.mainigie;

import java.util.Scanner;

public class Uzdevums5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c1, c2, c3, c4, c5;
		System.out.println("Enter number");
		a = input.nextInt();
		b = input.nextInt();
		c1 = a + b;
		c2 = a - b;
		c3 = a * b;
		c4 = a / b;
		c5 = a % b;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

	}

}
