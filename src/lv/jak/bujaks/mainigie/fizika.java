package lv.jak.bujaks.mainigie;

import java.util.Scanner;

public class fizika {

	public static void main(String[] args) {
		double x, y, p, s;//
		Scanner input = new Scanner(System.in);
		System.out.println("Ievadiet pirmās malas garumu: ");
		x = input.nextDouble();
		System.out.println("Ievadiet Otrās malas garumu malas garumu: ");
		y = input.nextDouble();
		s = x * y;
		p = x * 2 + y * 2;
		System.out.println("Perimetrs : " + p + " Laukums :  " + s);

	}

}
