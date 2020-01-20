package lv.jak.bujaks.mainigie;

import java.util.Scanner;

public class Uzdevums6 {

	public static void main(String[] args) {
		int a,b=1,c;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		a = input.nextInt();
		while (b<=10) {
			c=a*b;
			b=b+1;
			System.out.println(c);			
		}
		
	}
}