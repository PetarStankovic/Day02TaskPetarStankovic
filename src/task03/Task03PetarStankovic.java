package task03;

import java.util.Scanner;

/*
 * Sa standardnog ulaza prihvatiti trocifreni broj.
 * Napisati program koji nalazi najveci i najmanji trocifreni broj
 * koji se moze zapisati pomocu cifara unetog trocifrenog broja
 */

public class Task03PetarStankovic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int broj = 0;
		System.out.print("Unesite trocifreni broj:\n->");
		broj = sc.nextInt();

		while (!(broj > 99 && broj < 1000)) {
			System.out.print("Broj mora biti trocifren!\n->");
			broj = sc.nextInt();
		}
		sc.close();

		int cifraStotine = broj / 100; // 3
		int cifraDesetice = (broj / 10) % 10; // 35 % 10 = 5
		int cifraJedinice = broj % 10;

		// min, max i mid
		int min = cifraStotine;
		if (min > cifraDesetice)
			min = cifraDesetice;
		if (min > cifraJedinice)
			min = cifraJedinice;

		int max = cifraStotine;
		if (cifraDesetice > max)
			max = cifraDesetice;
		if (cifraJedinice > max)
			max = cifraJedinice;

		int mid = cifraStotine + cifraDesetice + cifraJedinice - (min + max);

		// najmanji trocifreni broj od cifara min, mid i max
		int minNumber;
		if (min != 0) {
			minNumber = min * 100 + mid * 10 + max;
		} else {
			if (mid == 0) {
				minNumber = max * 100;
			} else {
				minNumber = mid * 100 + max;
			}
		}
		System.out.println("Najmanji broj je: " + minNumber);

		int maxNumber = max * 100 + mid * 10 + min;
		System.out.println("Najveci broj je:  " + maxNumber);

	}
}
