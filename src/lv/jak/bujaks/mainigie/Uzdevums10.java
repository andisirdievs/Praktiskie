package lv.jak.bujaks.mainigie;

import java.util.Scanner;

public class Uzdevums10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c;
		System.out.println("Ievadiet sakitlus");
		a = input.nextDouble();
		c = input.nextDouble();
		b = input.nextDouble();
		double average = (a + b + c) / 3;
		System.out.println(average);
	}

}
