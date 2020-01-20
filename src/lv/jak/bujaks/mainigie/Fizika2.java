package lv.jak.bujaks.mainigie;

import java.util.Scanner;

public class Fizika2 {

	public static void main(String[] args) {
		double x, y, c;
		Scanner input = new Scanner(System.in);
		System.out.println("Ievadiet km/h: ");
		x = input.nextDouble();
		c = x * 1000 / 3600;
		System.out.println("iznākums ir " + c + " m/s");

	}

}
//12