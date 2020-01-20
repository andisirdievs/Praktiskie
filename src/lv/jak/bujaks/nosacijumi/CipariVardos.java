package lv.jak.bujaks.nosacijumi;

import java.util.Scanner;

public class CipariVardos {

	public static void main(String[] args) {

		int x;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		if (x<0) {
			System.out.println("Skaitlis mazaks par 0");
			
			
		}
		if ((x/1000) % 10 == 1) {
		System.out.println("Viens Tūukstotis ");
		}
		else if ((x/1000) % 10 == 2) {
			System.out.println("Divi Tūkstoši ");
	}

		else if ((x/1000) % 10 == 3) {
			System.out.println("Trīs Tūsktoši ");
		}
		else if ((x/1000) % 10 == 4) {
			System.out.println("Četri tūkstoši ");
		}
		else if ((x/1000) % 10 == 5) {
			System.out.println("Pieci tūkstoši ");
		}
		else if ((x/1000) % 10 == 6) {
			System.out.println("Seši Tūkstoši ");
		}
		else if ((x/1000) % 10 == 7) {
			System.out.println("Septiņi Tūkstoši ");
		}
		else if ((x/1000) % 10 == 8) {
			System.out.println("Astoņi Tūkstoši ");
		}
		else if ((x/1000) % 10 == 9) {
			System.out.println("Deviņi Tūkstoši ");
		}
		if ((x/100) % 10 == 1) {
			System.out.println("Viens Simts");
	}
		else if ((x/100) % 10 == 2) {
			System.out.println("Divi Simti");
	}
		else if ((x/100) % 10 == 3) {
			System.out.println("Trīs Simti");
	}
		else if ((x/100) % 10 == 4) {
			System.out.println("Četri Simti ");
	}
		else if ((x/100) % 10 == 5) {
			System.out.println("Pieci Simti ");
			
	}
		
	}
}
