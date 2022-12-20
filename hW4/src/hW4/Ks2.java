package hW4;

import java.util.Scanner;

public class Ks2 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa “Girdiginiz isim
		 * a harfi iceriyor” - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi
		 * iceriyor” - ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor”
		 * yazdirin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Isminizi giriniz:");
		String isim = scan.nextLine();

		if (isim.contains("a")) {
			System.out.println("Girilen isim a harfi iceriyor");

		} else if (isim.contains("Z")) {
			System.out.println("Girilen isim Z harfi iceriyor");

		} else {
			System.out.println("Girilen isim a veya Z harfi icermiyor");
		}

	}

}
