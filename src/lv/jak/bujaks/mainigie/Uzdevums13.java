package lv.jak.bujaks.mainigie;

import java.util.Scanner;

public class Uzdevums13 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, d, radius = 6371.01;
		Scanner input = new Scanner(System.in);
		System.out.println("x1: ");
		x1 = input.nextDouble();
		System.out.println("y1: ");
		y1 = input.nextDouble();
		System.out.println("x2: ");
		x2 = input.nextDouble();
		System.out.println("y2: ");
		y2 = input.nextDouble();

		d = (radius * Math.acos((Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))));
		System.out.println(d + "km");

	}

}
