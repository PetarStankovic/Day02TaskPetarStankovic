package task02;

import java.util.Scanner;

/*
 * Napisati program koji na osnovu duzine stranica a,b,c prikazuje poruku
 * da li je trougao jednakokraki, jednakostranican, pravougli, nejednakostranican
 */
public class Task02PetarStankovic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;

		a = unosStranice(sc, a);
		b = unosStranice(sc, b);
		c = unosStranice(sc, c);

		System.out.println("Unete stranice: \na = " + a + "\nb = " + b + "\nc = " + c);

		// provere za trougao
		if (a + b > c && a + c > b && c + b > a) {
			if (a == b && a == c) {
				System.out.println("Trougao je jednakostranican.");
			} else {
				if (a == b || a == c || b == c) {
					System.out.println("Trougao je jednakokraki.");
					if (daLiJePravougli(a, b, c)) {
						System.out.println("Trougao je i pravougli.");
					}
				} else {
					System.out.println("Trougao je nejednakostranican.");
					if (daLiJePravougli(a, b, c)) {
						System.out.println("Trougao je i pravougli.");
					}
				}
			}
		} else {
			System.out.println("Trougao nije moguc sa ovim stranicama.");
		}

	}

	// ponavlja se uslov dva puta pa da se ne duplira
	static boolean daLiJePravougli(int a, int b, int c) {
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
				|| Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
	}

	// provera da li je korisnik uneo int, da se ne prekida program ako pogresi
	static int unosStranice(Scanner sc, int num) {
		boolean isValid = false;
		while (isValid == false) {
			System.out.print("Unesite stranicu trougla: \n->");
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Morate ukucati broj!");
			}
			sc.nextLine();
		}
		return num;
	}

}
