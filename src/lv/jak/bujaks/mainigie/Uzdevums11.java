package lv.jak.bujaks.mainigie;

import java.util.Scanner;

public class Uzdevums11 {

	public static void main(String[] args) {
		double s, n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter polygons");
		s = input.nextDouble();
		System.out.println("Enter sides");
		n = input.nextDouble();
		double S = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
		System.out.println(S);
	}

}
