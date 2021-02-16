package task01;

import java.util.Scanner;

/*
 *  Napisati program koji proverava da li je zadata godina 
 *  prestupna.
 */
public class Task01PetarSankovic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int godina;
		System.out.print("Unesite godinu: \n->");
		godina = sc.nextInt();
		sc.close();

		if ((godina % 400 == 0) || ((godina % 4 == 0) && (godina % 100 != 0))) {
			System.out.println("Godina je prestupna.");
		} else {
			System.out.println("Godina nije prestupna.");
		}

	}

}
